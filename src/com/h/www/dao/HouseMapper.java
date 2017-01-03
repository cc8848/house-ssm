package com.h.www.dao;

import java.util.List;

import com.h.www.entity.House;

public interface HouseMapper {
	int deleteById(int houseid) throws Exception;

	int insert(House record) throws Exception;

	House selectByHouseId(int houseid) throws Exception;

	List<House> selectAll() throws Exception;

	List<House> selectHouseAndHouseDept();
	
	int updateById(House record) throws Exception;

	/**
	 * 售出房屋占比
	 * 
	 * @return
	 */
	Double selectSellPercent() throws Exception;

	/**
	 * 未售出房屋占比
	 * 
	 * @return
	 */
	Double selectUnSellPercent() throws Exception;

	/**
	 * 查询房屋总量
	 * 
	 * @return
	 */
	int selectCountAll() throws Exception;

	/**
	 * 根据区，栋，楼，房间号等四个条件查找房间ID
	 * 
	 * @param house提供区，栋，楼，房间号四个属性
	 * @return
	 */
	Integer selectHouseIdByFour(House house) throws Exception;

	/**
	 * 用户入住设置房间为空
	 * 
	 * @param house
	 * @return
	 */
	int updateHouseSetHouseNotEmpty(House house)  throws Exception;

	/**
	 * 用户跑出设置房间为非空
	 * 
	 * @param house
	 * @return
	 */
	int updateHouseSetHouseEmpty(House house)  throws Exception;

}