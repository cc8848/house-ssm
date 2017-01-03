package com.h.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h.www.dao.HouseDeptMapper;
import com.h.www.entity.HouseDept;
import com.h.www.service.HouseDeptService;

@Service("houseDeptService")
public class HouseDeptServiceImpl implements HouseDeptService {
@Autowired
HouseDeptMapper houseDeptMapper;
	@Override
	public int insert(HouseDept entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(HouseDept entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HouseDept selectById(int uid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateHousedeptByHouseId(HouseDept dept) throws Exception {
		return houseDeptMapper.updateHousedeptByHouseId(dept);
	}

	@Override
	public HouseDept selectHouseDeptByHouseId(Integer houseid) throws Exception {
		return houseDeptMapper.selectByHouseId(houseid);
	}

}
