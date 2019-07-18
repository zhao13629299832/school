package com.woniuxy.dao;

import com.woniuxy.entity.FriendSession;
import com.woniuxy.entity.FriendSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendSessionMapper {
    long countByExample(FriendSessionExample example);

    int deleteByExample(FriendSessionExample example);

    int deleteByPrimaryKey(String friendSessionId);

    int insert(FriendSession record);

    int insertSelective(FriendSession record);

    List<FriendSession> selectByExampleWithBLOBs(FriendSessionExample example);

    List<FriendSession> selectByExample(FriendSessionExample example);

    FriendSession selectByPrimaryKey(String friendSessionId);

    int updateByExampleSelective(@Param("record") FriendSession record, @Param("example") FriendSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") FriendSession record, @Param("example") FriendSessionExample example);

    int updateByExample(@Param("record") FriendSession record, @Param("example") FriendSessionExample example);

    int updateByPrimaryKeySelective(FriendSession record);

    int updateByPrimaryKeyWithBLOBs(FriendSession record);

    int updateByPrimaryKey(FriendSession record);
}