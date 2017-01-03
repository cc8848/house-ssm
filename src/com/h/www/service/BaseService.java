package com.h.www.service;

//基本方法：對單表的單條數據的增刪改查
public interface BaseService<T> {
	// 增
	int insert(T entity) throws Exception;
	// 刪
	int deleteById(int id) throws Exception;
	// 改
	int update(T entity) throws Exception;
	// 查
	T selectById(int uid) throws Exception;

}
