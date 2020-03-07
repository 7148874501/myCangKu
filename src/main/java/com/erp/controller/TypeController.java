package com.erp.controller;

import com.erp.pojo.Goods;
import com.erp.pojo.GoodsType;
import com.erp.service.GoodsTypeService;

import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("type")
public class TypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping("page")
    public EasyUiResultUtil<GoodsType> page(GoodsType wheres, @RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        System.out.println(wheres);


        return  goodsTypeService.page(wheres, pageNum, pageSize);
    }
    @RequestMapping("add")
    public boolean add(GoodsType goodsType){
        goodsTypeService.add(goodsType);
        return true;
    }
    @RequestMapping("update")
    public boolean update(GoodsType goodsType){
        goodsTypeService.update(goodsType);
        System.out.println("后端层"+goodsType);
        return true;
    }
    @RequestMapping("remove")
    public boolean remove(int[] ids){
        System.out.println(ids);
        goodsTypeService.remove(ids);
        return true;

    }
    @RequestMapping("findById")
    public GoodsType findById(int id){
        return goodsTypeService.findById(id);
    }






}
