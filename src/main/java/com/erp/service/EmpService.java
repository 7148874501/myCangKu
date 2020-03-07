package com.erp.service;

import com.erp.pojo.Emp;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;

import java.util.List;

public interface EmpService {
    /**
     *
     * @param ids
     */

    void remove(int[] ids);

    /**
     *
     * @param emp
     * @param roleIds 该员工对应的职位id
     */
    void update(Emp emp,int[] roleIds);

    /**
     * 根据id查找vo
     * @param id
     * @return
     */
    EmpVo findById(int id);

    /**
     * 增加
     * @param emp
     * @param roleIds
     */
    void add(Emp emp,int[] roleIds);

    /**
     *
     * @param wheres
     * @param pageNum
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<EmpVo>page(EmpVo wheres,int pageNum,int pageSize);

    /**
     * 根据账号和密码完成操作
     * @param username
     * @param password
     * @return
     */
    Emp login(String username, String password);

    List<TreeResultUtil> getPerms(String username);
}
