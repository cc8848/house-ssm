package com.h.www.dao;

import com.h.www.entity.HouseDept;

public interface HouseDeptMapper {
	int insert(HouseDept record) throws Exception;

	HouseDept selectByHouseId(Integer houseid) throws Exception;

	/**
	 * 通过houseid更新房屋欠费情况
	 * 
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	int updateHousedeptByHouseId(HouseDept dept) throws Exception;

}