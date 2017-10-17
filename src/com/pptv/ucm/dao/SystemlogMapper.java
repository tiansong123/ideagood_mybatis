package com.pptv.ucm.dao;

import com.pptv.ucm.entity.Systemlog;

public interface SystemlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemlog record);

    int insertSelective(Systemlog record);

    Systemlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemlog record);

    int updateByPrimaryKeyWithBLOBs(Systemlog record);

    int updateByPrimaryKey(Systemlog record);
}