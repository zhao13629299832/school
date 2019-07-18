package com.woniuxy.dao;

import com.woniuxy.entity.UserAddress;
import com.woniuxy.entity.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    long countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(String userAddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKey(String userAddressId);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}