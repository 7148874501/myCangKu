package com.erp.service;

import com.erp.pojo.Dept;
import com.erp.pojo.Goods;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface GoodsService {
    /**
     * 增加
     *
     * @param goods
     */
    void add(Goods goods);

    /**
     * 分页查询
     * @param wheres
     * @param pageNum
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Goods> page(Goods wheres, int pageNum, int pageSize);

    /**
     *
     * @param goods
     */
    void update(Goods goods);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    Goods findById(int id);
   void remove(int[]ids);

}
