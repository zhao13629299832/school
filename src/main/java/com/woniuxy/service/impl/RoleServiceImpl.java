package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.RoleMapper;
import com.woniuxy.dao.RoletreeMapper;
import com.woniuxy.entity.Role;
import com.woniuxy.entity.RoletreeExample;
import com.woniuxy.entity.RoletreeKey;
import com.woniuxy.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoletreeMapper roletreeMapper;
	
	@Transactional(readOnly = true)
	public List findAll() {
		return roleMapper.selectByExample(null);
	}

	@Transactional
	public void save(Role role,String ids) {
		roleMapper.insert(role);
		if(ids!=null&&ids.length()>0) {
			String[] idarr=ids.split(",");
			for(String id :idarr) {
				RoletreeKey key=new RoletreeKey();
				key.setRoleId(role.getRoleId());
				System.out.println(id);
				key.setTreeId(Integer.parseInt(id));
				roletreeMapper.insert(key);
			}
		}
	}

	@Transactional
	public void update(Role role,String ids) {
		roleMapper.updateByPrimaryKey(role);
		RoletreeExample example=new RoletreeExample();
		example.createCriteria().andRoleIdEqualTo(role.getRoleId());
		roletreeMapper.deleteByExample(example);
		
		if(ids!=null&&ids.length()>0) {
			String[] idarr=ids.split(",");
			for(String id :idarr) {
				RoletreeKey key=new RoletreeKey();
				key.setRoleId(role.getRoleId());
				key.setTreeId(Integer.parseInt(id));
				roletreeMapper.insert(key);
			}
		}
	}

	@Transactional(readOnly = true)
	public Role findById(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(roleId);
	}

}
