package com.h.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h.www.dao.UserMapper;
import com.h.www.entity.User;
import com.h.www.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public int insert(User entity) throws Exception {
		return userMapper.insert(entity);
	}

	@Override
	public int deleteById(int id) throws Exception {
		return userMapper.deleteById(id);
	}

	@Override
	public int update(User entity) throws Exception {
		return userMapper.updateById(entity);
	}

	@Override
	public User selectById(int uid) throws Exception {
		return userMapper.selectById(uid);
	}

	@Override
	public List<User> selectUserBasicInfo() throws Exception {
		return userMapper.selectAllBasic();
	}

	@Override
	public List<User> selectUserAndHouseAndHouseDept() throws Exception {
		return userMapper.selectUserAndHouseAndDept();
	}

	@Override
	public User selectUserAndHouseAndHouseDeptById(Integer uid)
			throws Exception {
		return userMapper.selectUserAndHouseAndDeptById(uid);
	}

	@Override
	public List<User> selectByHouseid(Integer houseid) {
		// TODO Auto-generated method stub
		return userMapper.selectByHouseid(houseid);
	}

}
