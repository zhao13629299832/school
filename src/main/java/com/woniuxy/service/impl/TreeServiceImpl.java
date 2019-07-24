package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.TreeMapper;
import com.woniuxy.service.ITreeService;

@Service
public class TreeServiceImpl implements ITreeService{

	@Resource
	private TreeMapper treeMapper;
	
	@Transactional(readOnly = true)
	public List findAll() {
		return treeMapper.selectByExample(null);
	}
	
}
