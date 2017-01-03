package com.h.www.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminActionInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("enter AdminActionInterceptor.preHandle");
		HttpSession session = request.getSession();
		if (session.getAttribute("admin") == null) {
			// request.getRequestDispatcher("/login.jsp").forward(request,
			// response);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return false;
		}
		// TODO Auto-generated method stub

		return true;
	}

}
