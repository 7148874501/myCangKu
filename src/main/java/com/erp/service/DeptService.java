package com.erp.service;

import com.erp.pojo.Dept;
import com.erp.util.EasyUiResultUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptService {
    List<Dept>findAll();

    /**
     *
     * @param pageNum 页码
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Dept> page(int pageNum, int pageSize);
    /**
     * 增加
     * @param dept
     */
    void add( Dept dept);

    /**
     * 根据id查找记录
     * @param id
     * @return
     */

    Dept findById(int id);

    /**
     * 增加功能
     * @param dept
     */
    void update( Dept dept);

    /**
     * 批量删除
     * @param ids
     */
    void remove ( Integer[] ids);


}
