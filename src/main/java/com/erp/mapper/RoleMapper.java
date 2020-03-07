package com.erp.mapper;

import com.erp.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /**
     * 分页查询
     * @param startNum 起始页
     * @param pageSize 每页展示条数
     * @return
     */
     List<Role>page(@Param("wheres") Role wheres, @Param("startNum") int startNum, @Param("pageSize") int pageSize);



    /**
     * 总条数
     * @return
     */
    int count(@Param("wheres") Role role);

    /**
     * 增加
     * @param role
     */
    void add(@Param("role") Role role);

    /**
     * 修改
     * @param role
     */
    void update(@Param("role") Role role);

    /**
     * 根据id 查找
     * @param id
     * @return
     */
    Role findById(@Param("id") int id);

    /**
     * 批量删除
     * @param ids
     */
    void remove(@Param("ids") Integer[]ids);

    List<Role> findAll();

    /**
     * 根据角色id查找权限id
     * @param roleId
     * @return
     */
   List<Integer> findPermissionIdsByRoleId(@Param("roleId") int roleId);
}
