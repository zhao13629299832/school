package com.woniuxy.dao;

import com.woniuxy.entity.UserinforoleExample;
import com.woniuxy.entity.UserinforoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    long countByExample(UserinforoleExample example);

    int deleteByExample(UserinforoleExample example);

    int deleteByPrimaryKey(UserinforoleKey key);

    int insert(UserinforoleKey record);

    int insertSelective(UserinforoleKey record);

    List<UserinforoleKey> selectByExample(UserinforoleExample example);

    int updateByExampleSelective(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);

    int updateByExample(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);
}