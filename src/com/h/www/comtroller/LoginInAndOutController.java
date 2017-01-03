package com.h.www.comtroller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.h.www.entity.Admin;
import com.h.www.service.AdminService;
import com.h.www.service.HouseService;
import com.h.www.utils.MD5Util;


@Controller
public class LoginInAndOutController {
	@Resource(name = "adminService")
	private AdminService adminService;
	@Resource(name = "houseService")
	private HouseService houseService;

	
	
	/**
	 * 用户登陆
	 * 
	 * @param session
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpSession session,
			@RequestParam("username") String username,
			@RequestParam("pwd") String password, HttpServletRequest request)
			throws Exception {
		// 测试是否进入该路径
		System.out.println("enter LoginController.login");

		// 输出获得的参数
		System.out.println("username:" + "" + username);
		System.out.println("password:" + "" + password);

		// 判断用户是否存在
		if (adminService.selectByNameAndPassword(username,
				MD5Util.MD5(password)) != null) {
			Admin admin = adminService.selectByNameAndPassword(username,
					MD5Util.MD5(password));

			// 1用户存在则向session中填充相关的数据
			// 1.1管理员信息
			Admin realData = adminService.selectCompleteInfo(admin.getUid());
			session.setAttribute("admin", realData);

			// 1.2饼状图信息
			Map<String, Double> piemap = houseService.selectHousePieChartData();
			session.setAttribute("piedata", piemap);

			// 1.3房屋总量
			Integer houseamount = houseService.selectCountAll();
			session.setAttribute("houseamount", houseamount);

			// 重新设置admin上次登陆的时间和IP
			admin.setLastLoginIp(request.getRemoteAddr());
			adminService.updateLoginTimeAndLoginIp(admin);

			// 为了提高用户体验度用重定向：如果使用转发的话，一刷新就会回到登陆页面
			// main页面操作频繁的页面建议用重定向
			// return "redirect:/WEB-INF/admin/main.jsp";
			return "/WEB-INF/admin/main";
		}
		// 用户不存在则重新回到登陆页面
		return "login";
	}

	/**
	 * 用户退出,session置空
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/loginout.do", method = RequestMethod.GET)
	public String loginOut(HttpSession session) {

		// 退出登录置空session中数据
		session.setAttribute("admin", null);
		session.setAttribute("piedata", null);
		session.setAttribute("houseamount", null);

		return "login";
	}

}
