package com.h.www.comtroller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.h.www.service.AdminService;

/**
 * @author:12
 * @Time:2016年12月17日上午11:20:38
 * @Description:主要做关于管理员自身信息的增删改查
 * @FileInfo:com.h.www.comtroller.AdminController.java
 */
@Controller
@RequestMapping("/admin/admin")
public class AdminController {
	@Resource(name = "adminService")
	private AdminService adminService;
	
	// 增加管理员账户
	@RequestMapping("/insert")
	public String insert() {
		return null;
	}

	// 删除管理员
	@RequestMapping("/delete")
	public String delete() {
		return null;
	}

	// 修改管理员：权限、密码
	@RequestMapping("/update")
	public String update() {
		return null;
	}

	// 查询管理员
	@RequestMapping("/select")
	public String select() {
		return null;
	}
}