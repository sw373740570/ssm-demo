package com.micro.feeling.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.micro.feeling.StoreEntity;
import com.micro.feeling.dao.StoreEntityMapper;
@Service("storeService")
public class StoreService {
	
	@Resource
	private StoreEntityMapper dao;
	
	public StoreEntity getStore(Integer id) {
		return dao.selectByPrimaryKey(id);
	}
}
