package com.erp.service.impl;

import com.erp.mapper.EmpMapper;
import com.erp.mapper.EmpRoleMapper;
import com.erp.mapper.GoodsMapper;
import com.erp.mapper.PermissionMapper;
import com.erp.pojo.Emp;
import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.erp.service.EmpService;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpRoleMapper empRoleMapper;
    @Autowired
    private  PermissionMapper permissionMapper;
    @Autowired
    private GoodsMapper goodsMapper;
//    private List<Goods> selectByExample(GoodsExample example){
//        return goodsMapper.selectByExample(example);
//    }

    @Override

    public void remove(int[] ids) {
        //先删除emp表
        empMapper.remove(ids);
        //还有删除emp_role表
        empRoleMapper.remove(ids);
    }

    @Override
    public void update(Emp emp, int[] roleIds) {

//在修改emp表
        empMapper.update(emp);
        //在修改emp_role--修改多对多
        //先删除
        empRoleMapper.remove(new int[]{emp.getId()});
        //再增加
        empRoleMapper.add(emp.getId(),roleIds);
    }

    @Override
    public EmpVo findById(int id) {

        return empMapper.findById(id);
    }

    @Override
    public void add(Emp emp, int[] roleIds) {
        //先设置默认的密码 默认为手机号后4位以及身份证号后4位组成
        String tel=emp.getTel();
        String idCardNo=emp.getIdCardNo();
        String password=tel.substring(tel.length()-4)+idCardNo.substring(idCardNo.length()-4);
        //在设置生日** 出身年月:默认从身份证中获取
        String birthDate=idCardNo.substring(6,14);
        StringBuilder stringBuilder=new StringBuilder(birthDate);
        stringBuilder.insert(6,"/").insert(4,"/");
        //把他们设置到emp中
        emp.setPassword(password);
        emp.setBirthDate(stringBuilder.toString());
        //再来执行增加
        empMapper.add(emp);
        //获取自动增长主键中增加
        int empId=empMapper.getkey();
        //在向emp_role中增加
        empRoleMapper.add(empId,roleIds);

    }

    @Override
    public EasyUiResultUtil<EmpVo> page(EmpVo wheres, int pageNum, int pageSize) {
        String []roleNames = wheres.getRoleNames()!=null? wheres.getRoleNames().split(","):null;
      System.out.println(Arrays.toString(roleNames));




        List<EmpVo> page=empMapper.page(wheres,roleNames, (pageNum-1)*pageSize, pageSize );
        int count=empMapper.count(roleNames,wheres);



        return new EasyUiResultUtil<EmpVo>(count,page);
    }

    @Override
    public Emp login(String username, String password) {
        return empMapper.login(username,password);
    }

    @Override
    public List<TreeResultUtil> getPerms(String username) {
        return permissionMapper.getPerms(username);

    }
}
