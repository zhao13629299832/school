package com.woniuxy.dao;

import com.woniuxy.entity.Post;
import com.woniuxy.entity.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(String postId);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(String postId);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}