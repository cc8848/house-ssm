package com.h.www.dao;

import com.h.www.entity.Group;

public interface GroupMapper {
	int deleteById(Integer id) throws Exception;

	int insert(Group record) throws Exception;

	Group selectById(Integer id) throws Exception;

	/**
	 * @param id：Admin的Id
	 * @return Group：該Admin對應的組信息
	 */
	Group selectByAdminId(Integer id) throws Exception;
	
	int updateById(Group record) throws Exception;
}