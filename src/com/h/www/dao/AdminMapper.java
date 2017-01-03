package com.h.www.dao;

import org.apache.ibatis.annotations.Param;

import com.h.www.entity.Admin;

public interface AdminMapper {
	int deleteById(Integer uid) throws Exception;

	int insert(Admin record) throws Exception;

	Admin selectById(Integer uid) throws Exception;

	Admin selectByNameAndPwd(@Param("name") String name,
			@Param("pwd") String pwd) throws Exception;

	Admin selectAdminAndGroupByAdminId(Integer uid) throws Exception;

	int update(Admin record) throws Exception;

	/**
	 * 修改管理员上次登陆的时间
	 * @param admin
	 * @return
	 */
	int updateLoginTimeAndLoginIp(Admin admin);
	
}