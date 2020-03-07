package com.erp.controller;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.service.GoodsService;
import com.erp.service.impl.GoodsServiceImpl;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("page")
    public EasyUiResultUtil<Goods>page(Goods wheres, @RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        System.out.println(wheres);


        return  goodsService.page(wheres, pageNum, pageSize);
    }
    @RequestMapping("add")
    public boolean add(Goods goods){
        goodsService.add(goods);
        return true;
    }
    @RequestMapping("update")
    public boolean update(Goods goods){
        goodsService.update(goods);
        System.out.println("后端层"+goods);
        return true;
    }
    @RequestMapping("remove")
    public boolean remove(int[]ids){
        goodsService.remove(ids);
        return true;

    }
    @RequestMapping("findById")
    public Goods findById(int id){
        return goodsService.findById(id);
    }






}
