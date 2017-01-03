package com.h.www.service;

import com.h.www.entity.Admin;

public interface AdminService extends BaseService<Admin> {
	
	// 查找Admin完整的信息admin_group_function
	Admin selectCompleteInfo(int uid) throws Exception;
	
	// 查找Admin是否存在
	Admin selectByNameAndPassword(String name, String pwd) throws Exception;
	
	// 更新上次登陆时间
	int updateLoginTimeAndLoginIp(Admin admin) throws Exception;
	
}
