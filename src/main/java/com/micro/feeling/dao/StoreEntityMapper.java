package com.micro.feeling.dao;

import com.micro.feeling.StoreEntity;

public interface StoreEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreEntity record);

    int insertSelective(StoreEntity record);

    StoreEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreEntity record);

    int updateByPrimaryKey(StoreEntity record);
}