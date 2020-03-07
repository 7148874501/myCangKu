package com.erp.service.impl;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.erp.service.GoodsService;
import com.erp.util.EasyUiResultUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void add(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public EasyUiResultUtil<Goods> page(Goods wheres, int pageNum, int pageSize) {
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria=example.createCriteria();
        if (wheres.getName()!=null&&wheres.getName()!=""){
            criteria.andNameLike("%"+ wheres.getName()+"%");
        }
        if (wheres.getOrigin()!=null&&wheres.getOrigin()!=""){
            criteria.andOriginLike("%"+ wheres.getOrigin()+"%");
        }
        if (wheres.getProducer()!=null&&wheres.getProducer()!=""){
            criteria.andProducerLike("%"+ wheres.getProducer()+"%");
        }
         //顺序不能错
        int count = (int) goodsMapper.countByExample(example);
        PageHelper.startPage(pageNum, pageSize);

        
        List<Goods> goods = goodsMapper.selectByExample(example);


        return new EasyUiResultUtil<Goods>(count,goods);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateByPrimaryKey(goods);
        System.out.println("业务层"+ goodsMapper.updateByPrimaryKey(goods));


    }

    @Override
    public Goods findById(int id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods ;
    }

    @Override
    public void remove(int[] ids) {
        goodsMapper.remove(ids);

    }
}
