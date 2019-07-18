package com.woniuxy.dao;

import com.woniuxy.entity.StoreInformationExample;
import com.woniuxy.entity.StoreInformationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreInformationMapper {
    long countByExample(StoreInformationExample example);

    int deleteByExample(StoreInformationExample example);

    int deleteByPrimaryKey(StoreInformationKey key);

    int insert(StoreInformationKey record);

    int insertSelective(StoreInformationKey record);

    List<StoreInformationKey> selectByExample(StoreInformationExample example);

    int updateByExampleSelective(@Param("record") StoreInformationKey record, @Param("example") StoreInformationExample example);

    int updateByExample(@Param("record") StoreInformationKey record, @Param("example") StoreInformationExample example);
}