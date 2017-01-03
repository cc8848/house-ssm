package com.h.www.comtroller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.h.www.entity.User;

/**
 * @author:12
 * @Time:2016年12月19日下午11:42:37
 * @Description:防止用户重复注册,与本项目无关，做着试试
 * @FileInfo:com.h.www.comtroller.FormController.java
 */
@Controller
@RequestMapping("/user")
public class FormController {
	@RequestMapping(value = "/sign", method = RequestMethod.GET)
	public String userSign(@PathVariable User user, HttpSession session) {
		if (session.getAttribute("ifuserhadsign") != null) {
			session.setAttribute("signmessage", "already signed");
			// 确认session状态之后快速退出
			return "/repetitivesubmission";
		}
		{
			// 伪代码区:假装已经保存了注册的信息
			System.out.println("这里假装已经保存好了用户:" + user);

			// 可以在session中设置一个时间和用户名，通过用户名确定是不是重复提交，通过该时间可以做比如十五分钟之内只能注册一个账号
			// 或者在session中保存一个数字，时间，同时也保存上次注册用的用户名：用户名可防止重复提交，数字统计已经注册的次数，数字加时间可以做疼训(QQ)的一天只能注册两三个账号的那种功能
			session.setAttribute("ifuserhadsign", true);
		}
		return "abc";
	}
	@RequestMapping(value = "/restsign/{uname}/{phone}")
	public String restSign(@PathVariable("uname") String uname,@PathVariable("phone") String phone) {
		System.out.println(uname+""+phone);
		//不指定返回页面
		return "/abc";
	}

}
