package com.h.www.dao;

import java.util.List;

import com.h.www.entity.User;

public interface UserMapper {
	int deleteById(Integer uid) throws Exception;

	User selectById(Integer uid) throws Exception;

	/**
	 * 分页查询用户及其租房信息
	 * 
	 * @return
	 * @throws Exception
	 */
	List<User> selectUserAndHouseAndDept() throws Exception;

	/**
	 * 根据Id查询用户，房屋，账单的具体信息
	 * 
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	User selectUserAndHouseAndDeptById(Integer uid) throws Exception;
	
	/**
	 * 根据houseid看房屋是否有人
	 * 
	 * @param houseid
	 * @return
	 */
	List<User> selectByHouseid(Integer houseid);

	/**
	 * 通过用户Id查找房间Id
	 * 
	 * @param uid
	 * @return
	 */
//	Integer selectHouseIdByUserID(Integer uid);

	List<User> selectAllBasic() throws Exception;

	int insert(User user) throws Exception;

	int updateById(User user) throws Exception;

}