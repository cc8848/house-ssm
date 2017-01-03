package com.h.www.service;

import java.util.List;

import com.h.www.entity.User;

public interface UserService extends BaseService<User> {
	// 查询所有用户基本信息
	List<User> selectUserBasicInfo() throws Exception;

	// 查詢所有戶主、房屋以及房屋賬單
	List<User> selectUserAndHouseAndHouseDept() throws Exception;
	
	//根据Id查询用户，房屋，账单的具体信息
	User selectUserAndHouseAndHouseDeptById(Integer uid) throws Exception;
	
	//根据houseid查询用户
	List<User> selectByHouseid(Integer houseid);
}
