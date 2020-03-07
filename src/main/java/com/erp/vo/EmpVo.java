package com.erp.vo;

public class EmpVo {
    private Integer id;
    private String username;
    private String tel;
    private String idCardNo;
    private String realName;
    /**
     * 性别0男1女
     *
     */
    private Integer gender;
    private String email;
    private String address;
    /**
     * 出生年月:默认从身份证中获取
     */
    private String birthDate;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 职位
     */
    private String roleNames;

    public EmpVo() {
    }

    public EmpVo(Integer id, String username, String tel, String idCardNo, String realName, Integer gender, String email, String address, String birthDate, String deptName, String roleNames) {
        this.id = id;
        this.username = username;
        this.tel = tel;
        this.idCardNo = idCardNo;
        this.realName = realName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.deptName = deptName;
        this.roleNames = roleNames;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getidCardNo() {
        return idCardNo;
    }

    public void setidCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    @Override
    public String toString() {
        return "EmpVo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deptName='" + deptName + '\'' +
                ", roleNames='" + roleNames + '\'' +
                '}';
    }
}
