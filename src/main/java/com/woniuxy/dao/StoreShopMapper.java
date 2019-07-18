package com.woniuxy.dao;

import com.woniuxy.entity.StoreShopExample;
import com.woniuxy.entity.StoreShopKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreShopMapper {
    long countByExample(StoreShopExample example);

    int deleteByExample(StoreShopExample example);

    int deleteByPrimaryKey(StoreShopKey key);

    int insert(StoreShopKey record);

    int insertSelective(StoreShopKey record);

    List<StoreShopKey> selectByExample(StoreShopExample example);

    int updateByExampleSelective(@Param("record") StoreShopKey record, @Param("example") StoreShopExample example);

    int updateByExample(@Param("record") StoreShopKey record, @Param("example") StoreShopExample example);
}