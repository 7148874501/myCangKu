package com.erp.mapper;

import com.erp.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {

    List<Dept>findAll();
    /**
     * 获得总数
     * @return
     */
    int count();


    /**
     * 分页查询
     * @param startNum 起始位置
     * @param pageSize 每页条数
     * @return
     */
    List<Dept>page(@Param("startNum") int startNum,@Param("pageSize") int pageSize);

    /**
     * 增加
     * @param dept
     */
    void add( @Param("dept") Dept dept);

    /**
     * 根据id查找记录
     * @param id
     * @return
     */

    Dept findById(@Param("id") int id);

    /**
     * 增加功能
     * @param dept
     */
    void update( @Param("dept") Dept dept);

    /**
     * 批量删除
     * @param ids
     */
    void remove (@Param("ids") Integer[] ids);






}
