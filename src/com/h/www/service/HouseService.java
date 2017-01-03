package com.h.www.service;

import java.util.List;
import java.util.Map;

import com.h.www.entity.House;

public interface HouseService extends BaseService<House> {

	// 获取房屋饼状图数据
	Map<String, Double> selectHousePieChartData() throws Exception;

	// 查询房屋总量
	int selectCountAll() throws Exception;
	
	//通过房间的区、栋、楼、房间号四个信息找houseid；
	Integer selectHouseIdByfour(House house) throws Exception;
	
	//通过房屋id(houseid)查找房屋的具体信息
	House selectHouseByHouseId(Integer houseid) throws Exception;

	// 用户入住时设置房间非空
	int updateHouseSetHouseNotEmpty(House house) throws Exception;

	// 用户跑出时设置房间为空
	int updateHouseSetHouseEmpty(House house) throws Exception;
	
	List<House> selectHouseAndHouseDept();
}
