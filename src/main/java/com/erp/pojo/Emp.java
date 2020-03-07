package com.erp.pojo;

public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String tel;
    private String idCardNo;
    private String realName;
    /**
     * 性别:0男1女
     */
    private Integer gender;
    private String email;
    private String address;
    /**
     * 出生年月:默认从身份证中获取
     */
    private String birthDate;
    private Integer deptId;

    public Emp() {
    }

    public Emp(Integer id, String username, String password, String tel, String idCardNo, String realName, Integer gender, String email, String address, String birthDate, Integer deptId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.idCardNo = idCardNo;
        this.realName = realName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.deptId = deptId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
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

    public Integer getdeptId() {
        return deptId;
    }

    public void setdeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
