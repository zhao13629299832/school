package com.woniuxy.dao;

import com.woniuxy.entity.PostInfomationExample;
import com.woniuxy.entity.PostInfomationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostInfomationMapper {
    long countByExample(PostInfomationExample example);

    int deleteByExample(PostInfomationExample example);

    int deleteByPrimaryKey(PostInfomationKey key);

    int insert(PostInfomationKey record);

    int insertSelective(PostInfomationKey record);

    List<PostInfomationKey> selectByExample(PostInfomationExample example);

    int updateByExampleSelective(@Param("record") PostInfomationKey record, @Param("example") PostInfomationExample example);

    int updateByExample(@Param("record") PostInfomationKey record, @Param("example") PostInfomationExample example);
}