package com.woniuxy.dao;

import com.woniuxy.entity.DriverInformationExample;
import com.woniuxy.entity.DriverInformationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverInformationMapper {
    long countByExample(DriverInformationExample example);

    int deleteByExample(DriverInformationExample example);

    int deleteByPrimaryKey(DriverInformationKey key);

    int insert(DriverInformationKey record);

    int insertSelective(DriverInformationKey record);

    List<DriverInformationKey> selectByExample(DriverInformationExample example);

    int updateByExampleSelective(@Param("record") DriverInformationKey record, @Param("example") DriverInformationExample example);

    int updateByExample(@Param("record") DriverInformationKey record, @Param("example") DriverInformationExample example);
}