package com.erp.service;

import com.erp.pojo.Role;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;

import java.util.List;

public interface RoleService {
    EasyUiResultUtil<Role> page(Role wheres,int pageNum, int pageSize);

    void add(Role role);
    void update(Role role);
    void remove(Integer[] ids);
    Role findById(int id);

    List<Role> findAll();

    /**
     * 权限
     * @return
     */
    List<TreeResultUtil> list();

    List<Integer> findPermissionIdsByRoleId(int roleId);

    void deleteRolePermByRoleId(Integer roleId, Integer[] permIds);
}
