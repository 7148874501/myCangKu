package com.erp.util;

import java.util.List;

public class TreeResultUtil {
    private int id;//指定的id
    private String text;//展示的内容
    private String iconCls;//权限图标
    private String url;//权限的连接
    //创建一个当前对象的集合 作为子权限 树的分支
    private List<TreeResultUtil> children;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TreeResultUtil() {
    }

    public TreeResultUtil(int id, String text, String iconCls, List<TreeResultUtil> children) {
        this.id = id;
        this.text = text;
        this.iconCls = iconCls;
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeResultUtil{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", children=" + children +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public List<TreeResultUtil> getChildren() {
        return children;
    }

    public void setChildren(List<TreeResultUtil> children) {
        this.children = children;
    }
}
