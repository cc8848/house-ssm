package com.h.www.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.h.www.entity.Function;

public interface FunctionMapper {
	int deleteById(Integer id) throws Exception;

	int insert(Function record) throws Exception;

	Function selectById(Integer id) throws Exception;

	int updateById(Function record) throws Exception;

	List<Function> selectFunctionListByFunctionId(@Param("funlist")String[] funlist) throws Exception;
	
}