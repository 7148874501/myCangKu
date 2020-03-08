package com.erp.mapper;

import com.erp.pojo.Emp;
import com.erp.vo.EmpVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     * 查询条件
     * @param wheres 查询条件
     * @param start 分页起始位置
     * @param pageSize 每页展示条数
     * @return
     */

    List<EmpVo>page(@Param("wheres") EmpVo wheres,@Param("roleNames") String[]roleNames, @Param("start") int start,@Param("pageSize") int pageSize);

    /**查询总数
     *
     * @param wheres 查询条件
     * @return
     */
    int count(@Param("roleNames") String[]roleNames,@Param("wheres") EmpVo wheres);

    /**
     * 增加
     * @param emp
     */

    void add(@Param("emp") Emp emp);

    /**
     * 修改
     * @param emp
     */
    void update(@Param("emp") Emp emp);

    /**
     * 根据id查找vo
     * @param id
     * @return
     */

    EmpVo findById(@Param("id") int id);

    /**
     * 删除
     * @param ids
     */
    void remove(@Param("ids") int[] ids);

    /**
     * 获取自动增长的主键
     * @return
     */
    int getkey();


    Emp login(@Param("username") String username,@Param("password") String password);
}
