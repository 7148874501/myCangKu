package com.erp.service.impl;

import com.erp.mapper.PermissionMapper;
import com.erp.mapper.RoleMapper;

import com.erp.pojo.Role;
import com.erp.service.RoleService;
import com.erp.util.EasyUiResultUtil;


import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public EasyUiResultUtil<Role> page(Role wheres,int pageNum, int pageSize) {
        List<Role> page=roleMapper.page(wheres, (pageNum-1)*pageSize, pageSize);
        int count=roleMapper.count(wheres);
       return new EasyUiResultUtil<Role>(count,page);

}

    @Override
    public void add(Role role) {
        roleMapper.add(role);


    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);

    }

    @Override
    public void remove(Integer[] ids) {
        roleMapper.remove(ids);

    }

    @Override
    public Role findById(int id) {
        return roleMapper.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    /**
     * 权限查询
     * @return
     */

    public List<TreeResultUtil>list(){
        return permissionMapper.list();
    }
    public List<Integer> findPermissionIdsByRoleId(int roleId){
        return roleMapper.findPermissionIdsByRoleId(roleId);
    }
    public void deleteRolePermByRoleId(Integer roleId,Integer[] permIds){
        //先删除后增加
        permissionMapper.remove(roleId);
        permissionMapper.add(roleId,permIds);
    }

}
