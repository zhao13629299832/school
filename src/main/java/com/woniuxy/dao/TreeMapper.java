package com.woniuxy.dao;

import com.woniuxy.entity.Tree;
import com.woniuxy.entity.TreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeMapper {
	List findTreeWithUid(String userPhone);
	
    long countByExample(TreeExample example);

    int deleteByExample(TreeExample example);

    int deleteByPrimaryKey(Integer treeId);

    int insert(Tree record);

    int insertSelective(Tree record);

    List<Tree> selectByExample(TreeExample example);

    Tree selectByPrimaryKey(Integer treeId);

    int updateByExampleSelective(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByExample(@Param("record") Tree record, @Param("example") TreeExample example);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);
}