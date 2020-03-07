package com.erp.service;

import com.erp.pojo.Goods;
import com.erp.pojo.GoodsType;
import com.erp.util.EasyUiResultUtil;

public interface GoodsTypeService {
    /**
     * 增加
     *
     * @param
     */
    void add(GoodsType goodsType);

    /**
     * 分页查询
     * @param wheres
     * @param pageNum
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<GoodsType> page(GoodsType wheres, int pageNum, int pageSize);

    /**
     *
     * @param
     */
    void update(GoodsType goodsType);
    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    GoodsType findById(int id);
    void remove(int[] ids);

}
