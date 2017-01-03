package com.h.www.service;

import com.h.www.entity.HouseDept;

public interface HouseDeptService extends BaseService<HouseDept> {

	/**
	 * 更新房屋欠费情况
	 * 
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	int updateHousedeptByHouseId(HouseDept dept) throws Exception;

	/**
	 * 通过房屋id(houseid)查询房屋欠费情况
	 * 
	 * @param houseid
	 * @return
	 */
	HouseDept selectHouseDeptByHouseId(Integer houseid)  throws Exception ;
}
