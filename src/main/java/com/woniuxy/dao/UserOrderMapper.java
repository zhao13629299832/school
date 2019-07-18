package com.woniuxy.dao;

import com.woniuxy.entity.UserOrder;
import com.woniuxy.entity.UserOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrderMapper {
    long countByExample(UserOrderExample example);

    int deleteByExample(UserOrderExample example);

    int deleteByPrimaryKey(String userOrderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    List<UserOrder> selectByExample(UserOrderExample example);

    UserOrder selectByPrimaryKey(String userOrderId);

    int updateByExampleSelective(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    int updateByExample(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}