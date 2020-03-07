package com.erp.controller;

import com.erp.pojo.Role;
import com.erp.service.RoleService;
import com.erp.service.impl.RoleServiceImpl;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;


    @RequestMapping("page")
    private EasyUiResultUtil<Role> page( Role wheres,@RequestParam(defaultValue="1") int pageNum,@RequestParam(defaultValue = "2") int pageSize){

        System.out.println(wheres);
        return roleService.page(wheres,pageNum, pageSize);
    }
    @RequestMapping("add")
    private boolean add(Role role){
        roleService.add(role);
        return true;
    }
    @RequestMapping("remove")
    private boolean remove(Integer[]ids){
        roleService.remove(ids);
        return true;
    }
    @RequestMapping("update")
    private boolean update(Role role){
        roleService.update(role);
        return true;
    }
    @RequestMapping("findById")
    private Role findById(int id){
        return roleService.findById(id);
    }
    @RequestMapping("findAll")
    private List<Role> findAll(){

return roleService.findAll();

    }
    @RequestMapping("permissionList")
    public List<TreeResultUtil>list(){
        return roleService.list();
    }
    @RequestMapping("findPermissionIdsByRoleId")
    private List<Integer>findPermissionIdsByRoleId(int roleId){
        return roleService.findPermissionIdsByRoleId(roleId);
    }
    @RequestMapping("updatePerm")
    public boolean updatePerm(Integer roleId,Integer[] permIds){
        roleService.deleteRolePermByRoleId(roleId,permIds);
        return true;

    }


}
