package com.pptv.ucm.dao;

import com.pptv.ucm.entity.MacGoods;

public interface MacGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MacGoods record);

    int insertSelective(MacGoods record);

    MacGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MacGoods record);

    int updateByPrimaryKey(MacGoods record);
}