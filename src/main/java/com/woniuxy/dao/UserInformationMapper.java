package com.woniuxy.dao;

import com.woniuxy.entity.UserInformation;
import com.woniuxy.entity.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInformationMapper {
    long countByExample(UserInformationExample example);

    int deleteByExample(UserInformationExample example);

    int deleteByPrimaryKey(String userPhone);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    List<UserInformation> selectByExample(UserInformationExample example);

    UserInformation selectByPrimaryKey(String userPhone);

    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}