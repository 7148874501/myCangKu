package com.erp.mapper;

import com.erp.util.TreeResultUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    /**
     *
     * @return
     */
    List<TreeResultUtil> list() ;

    /**
     * 删除
     * @param roleId
     */

    void remove(@Param("roleId") int roleId);

    /**
     *
     * @param roleId
     * @param permIds
     */

    void add(@Param("roleId") Integer roleId,@Param("permIds") Integer[] permIds);

    List<TreeResultUtil> getPerms(@Param("username") String username);
}
