package com.erp.service.impl;

import com.erp.mapper.GoodsTypeMapper;

import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.erp.pojo.GoodsType;
import com.erp.pojo.GoodsTypeExample;
import com.erp.service.GoodsTypeService;
import com.erp.util.EasyUiResultUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public void add(GoodsType goodsType) {
        goodsTypeMapper.insert(goodsType);
    }

    @Override
    public EasyUiResultUtil<GoodsType> page(GoodsType wheres, int pageNum, int pageSize) {
        GoodsTypeExample example=new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria=example.createCriteria();
        if (wheres.getName()!=null&&wheres.getName()!=""){
            criteria.andNameLike("%"+ wheres.getName()+"%");
        }

        //顺序不能错
        int count = (int) goodsTypeMapper.countByExample(example);
        PageHelper.startPage(pageNum, pageSize);


        List<GoodsType> goodsType = goodsTypeMapper.selectByExample(example);


        return new EasyUiResultUtil<GoodsType>(count,goodsType);
    }

    @Override
    public void update(GoodsType goodsType) {
        goodsTypeMapper.updateByPrimaryKey(goodsType);



    }

    @Override
    public GoodsType findById(int id) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(id);
        return goodsType ;
    }

    @Override
    public void remove(int[] ids) {
        goodsTypeMapper.remove(ids);

    }
}
