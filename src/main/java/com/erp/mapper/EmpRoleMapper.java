package com.erp.mapper;

import org.apache.ibatis.annotations.Param;

public interface EmpRoleMapper {
    /**
     *
     * @param ids
     */
    void remove(@Param("ids") int[]ids);

    /**
     *
     * @param id
     * @param roleIds
     */
    void add(@Param("id") Integer id,@Param("roleIds") int[] roleIds);

}
