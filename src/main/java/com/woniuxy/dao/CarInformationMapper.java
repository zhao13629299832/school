package com.woniuxy.dao;

import com.woniuxy.entity.CarInformationExample;
import com.woniuxy.entity.CarInformationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarInformationMapper {
    long countByExample(CarInformationExample example);

    int deleteByExample(CarInformationExample example);

    int deleteByPrimaryKey(CarInformationKey key);

    int insert(CarInformationKey record);

    int insertSelective(CarInformationKey record);

    List<CarInformationKey> selectByExample(CarInformationExample example);

    int updateByExampleSelective(@Param("record") CarInformationKey record, @Param("example") CarInformationExample example);

    int updateByExample(@Param("record") CarInformationKey record, @Param("example") CarInformationExample example);
}