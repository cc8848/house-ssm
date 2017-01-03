package com.h.www.comtroller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.h.www.entity.House;
import com.h.www.service.HouseService;

@RequestMapping("/admin/house")
@Controller
public class HouseController {
	@Resource(name = "houseService")
	private HouseService houseService;

	// 查询房屋信息
	@RequestMapping("/gethousedetail")
	public String addHouseDetail(HttpServletRequest request,
			@RequestParam(value = "visittingPage", required = false) String visittingPage) {
		if (visittingPage != null) {
			int visit = Integer.parseInt(visittingPage);
			PageHelper.startPage(visit, 9);
		} else {
			PageHelper.startPage(1, 9);
		}

		List<House> houselist = houseService.selectHouseAndHouseDept();
		PageInfo<House> pageinfo = new PageInfo<>(houselist);
		request.setAttribute("houselist", houselist);
		request.setAttribute("pageinfo", pageinfo);
		return "/fy_list";
	}
}
