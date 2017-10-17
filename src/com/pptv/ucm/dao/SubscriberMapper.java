package com.pptv.ucm.dao;

import com.pptv.ucm.entity.Subscriber;

public interface SubscriberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subscriber record);

    int insertSelective(Subscriber record);

    Subscriber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subscriber record);

    int updateByPrimaryKey(Subscriber record);
}