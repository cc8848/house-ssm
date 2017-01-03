package com.h.www.comtroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h.www.entity.House;
import com.h.www.entity.HouseDept;
import com.h.www.entity.User;
import com.h.www.service.AdminService;
import com.h.www.service.HouseDeptService;
import com.h.www.service.HouseService;
import com.h.www.service.UserService;

/**
 * @author:12
 * @Time:2016年12月11日上午10:36:07
 * @Description:房屋管理系统的主要增删改查
 * @FileInfo:com.h.comtroller.HouseController
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Resource(name = "adminService")
	private AdminService adminService;
	@Resource(name = "userService")
	private UserService userService;
	@Resource(name = "houseService")
	private HouseService houseService;
	@Resource(name = "houseDeptService")
	private HouseDeptService houseDeptService;

	/**
	 * 添加住户
	 * 数据库为节约资源将house各种数量属性设置为非int，导致工作量大增，页面数据(String)传过来转换异常,后又改成Integer类型
	 * 
	 * @param user
	 * @param housezorn
	 * @param housebuilding
	 * @param houselevel
	 * @param houseroomnum
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adduser")
	public String addUser(User user, House house, HttpServletRequest request)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		// 首先看主要参数是不是空，非空则正常操作
		if (user.getUname() == null || "".equals(user.getUname())
				|| user.getUindentyid() == null
				|| "".equals(user.getUindentyid()) || user.getPhone() == null
				|| "".equals(user.getPhone()) || user.getIshouseOwner() == null
				|| "".equals(user.getIshouseOwner())
				|| house.getHousezorn() == null
				|| "".equals(house.getHousezorn())
				|| house.getHousebuilding() == null
				|| "".equals(house.getHousebuilding())
				|| house.getHouselevel() == null
				|| "".equals(house.getHouselevel())
				|| house.getHouseroomnum() == null
				|| "".equals(house.getHouseroomnum())) {

			// 为空就重定向到该页
			return "redirect:/add_householder.jsp";

		}
		// 通过查询获取用户的房间号
		System.out.println("ok");
		int houseid = houseService.selectHouseIdByfour(house);
		house.setHouseid(houseid);
		user.setHouseid(houseid);

		houseService.updateHouseSetHouseNotEmpty(house);
		userService.insert(user);

		return "forward:user_house";
	}

	@RequestMapping(value = "/json.do", method = RequestMethod.POST)
	public @ResponseBody String getRentalHousingStatistics() {
		System.out.println("enter json");

		Map<String, Object> map = new HashMap<>();
		map.put("returnmessage", "this is the detail of the return message");
		// 要转成JsonString，Jsp页面才能正常接收
		String returnmessage = JSON.toJSONString(map);
		return returnmessage;
	}

	// 获取用户信息
	@RequestMapping("/getuser/{uid}")
	public String getUser(@PathVariable("uid") Integer uid,
			Map<String, User> usermap, HttpServletRequest request)
			throws Exception {

		// 获取用户信息
		User user = userService.selectUserAndHouseAndHouseDeptById(uid);

		// 往页面填充数据
		usermap.put("user", user);

		// 返回页面
		return "/edituser";
	}

	/**
	 * 修改的用户信息:根据输入房屋参数得到房屋I(houseid),修改用户表信息,房屋和账单不动
	 * 
	 * @param user
	 * @param house
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edituser")
	public String eiitUser(User user, House house, HouseDept dept)
			throws Exception {
		// 1.house操作
		house = user.getHouse();
		int oldhouseid = user.getHouseid();// 原来房屋的houseid

		int houseid = houseService.selectHouseIdByfour(house);// 页面输入房屋的houseid

		// 如果两次的houseid不同：看原来房屋是否还有人，有人则不操作该房屋，
		// 原来房间无人则将该原来房屋置空，新房间置为非空
		if (houseid != oldhouseid) {
			if (userService.selectByHouseid(oldhouseid) == null) {
				houseService.updateHouseSetHouseEmpty(house);
			}
			house.setHouseid(houseid);
			houseService.updateHouseSetHouseNotEmpty(house);
			System.out.println(2);
		}
		System.out.println(3);
		// 2.user操作
		user.setHouseid(houseid);
		userService.update(user);

		// 3.dept操作
		dept = user.getHouseDept();
		dept.setHouseid(oldhouseid);
		houseDeptService.updateHousedeptByHouseId(dept);
		return "/edituser";
	}

	/**
	 * 查询房屋信息
	 * 
	 * @param visittingPage当前访问页面
	 * visitingpage 设置为String类型 ：防恶意注入--输入为非Integer类型数据时不能进入该路径而且会报错，String则确保了无论输入何种类型都能进入该路径
	 * @param request  装载数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user_house")
	public String getUserAndHouse(
			@RequestParam(value = "visittingPage", required = false) String visittingPage,
			HttpServletRequest request, House house) throws Exception {
		// 1.进入此页面则输出
		System.out.println("enter UserController.getUserAndHouse");
		System.out.println("visittingPage:" + visittingPage);
		System.out.println("house:" + house);

		// A.有查询的话
		if (house.getHousezorn() != null) {
			System.out.println("enter");
			Integer houseid = houseService.selectHouseIdByfour(house);
			System.out.println("houseid:" + houseid);
			if (houseid != null) {
				List<User> userlist = userService.selectByHouseid(houseid);
				PageInfo<User> pageinfo = new PageInfo<>(userlist);

				request.setAttribute("userlist", userlist);
				request.setAttribute("pageinfo", pageinfo);
			}

			// 返回指定页面
			return "/householder_list";
		}

		// 2.一页设置八条数据
		if (visittingPage == null) {
			PageHelper.startPage(1, 8);
		} else {
			try {
				int visiting = Integer.parseInt(visittingPage);
				PageHelper.startPage(visiting, 8);
			} catch (NumberFormatException e) {
				PageHelper.startPage(1, 8);
			}

		}

		// 3.数据内容
		// 3.1数据内容:user信息
		List<User> userlist = userService.selectUserAndHouseAndHouseDept();
		// 3.2页面信息：总条数，页数，当前页数
		PageInfo<User> pagenfo = new PageInfo<User>(userlist);

		// 4.数据装填：user信息;每页的信息
		request.setAttribute("userlist", userlist);
		request.setAttribute("pageinfo", pagenfo);

		// 返回指定页面
		return "/householder_list";
	}

	/**
	 * 删除住户之前先查询房屋是否还欠费，未欠费正常删除，欠费则先交费用，然后查询该房间是否还有人，没有人的话该房间置空，查询原来房间是否为空，
	 * 
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/del")
	public String delById(Integer uid, HttpServletRequest request)
			throws Exception {
		System.out.println("enter del");
		System.out.println(uid);
		User user = userService.selectById(uid);
		Integer houseid = user.getHouseid();

		HouseDept dept = houseDeptService.selectHouseDeptByHouseId(houseid);
		if (dept.getDebt() > 0) {

			List<User> userlist = userService.selectByHouseid(houseid);
			PageInfo<User> pagenfo = new PageInfo<User>(userlist);

			request.setAttribute("userlist", userlist);
			request.setAttribute("pageinfo", pagenfo);
			request.setAttribute("user_uid", user.getUid());
			request.setAttribute("deleteerror", "请先确定该房屋欠费已交再删除该用户!");

			return "/householder_list";
		}

		userService.deleteById(uid);
		List<User> userlist = userService.selectByHouseid(houseid);
		if (userlist == null) {
			House house = new House();
			house.setHouseid(houseid);
			houseService.updateHouseSetHouseEmpty(house);
		}
		return "forward:/admin/user/user_house";
	}

}
