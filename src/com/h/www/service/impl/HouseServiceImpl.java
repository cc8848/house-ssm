package com.h.www.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.aop.target.HotSwappableTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h.www.dao.HouseMapper;
import com.h.www.dao.UserMapper;
import com.h.www.entity.House;
import com.h.www.service.HouseService;

@Service("houseService")
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseMapper houseMapper;

	@Override
	public int insert(House entity) throws Exception {
		return houseMapper.insert(entity);
	}

	@Override
	public int deleteById(int id) throws Exception {
		return houseMapper.deleteById((short) id);
	}

	@Override
	public int update(House entity) throws Exception {
		return houseMapper.updateById(entity);
	}

	@Override
	public House selectById(int uid) throws Exception {
		return houseMapper.selectByHouseId((short) uid);
	}

	/**
	 * 填充饼状图信息
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, Double> selectHousePieChartData() throws Exception {
		Map<String, Double> piemap = new HashMap<>();
		// 房屋售出率
		double sell = houseMapper.selectSellPercent();
		// 房屋沒有售出率
		double others = houseMapper.selectUnSellPercent();

		// 數據裝填
		piemap.put("居住率", sell);
		piemap.put("空房率", others);
		return piemap;
	}

	@Override
	public int selectCountAll() throws Exception {
		return houseMapper.selectCountAll();
	}

	@Override
	public int updateHouseSetHouseNotEmpty(House house) throws Exception {
		int houseid = houseMapper.selectHouseIdByFour(house);
		house.setHouseid(houseid);
		return houseMapper.updateHouseSetHouseNotEmpty(house);
	}

	@Override
	public int updateHouseSetHouseEmpty(House house) throws Exception {
		int houseid = houseMapper.selectHouseIdByFour(house);
		house.setHouseid(houseid);
		return houseMapper.updateHouseSetHouseEmpty(house);
	}

	@Override
	public Integer selectHouseIdByfour(House house) throws Exception {
		return houseMapper.selectHouseIdByFour(house);
	}

	@Override
	public House selectHouseByHouseId(Integer houseid) throws Exception {
		// TODO Auto-generated method stub
		return houseMapper.selectByHouseId(houseid);
	}

	@Override
	public List<House> selectHouseAndHouseDept() {
		return houseMapper.selectHouseAndHouseDept();
	}

}
