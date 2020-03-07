package com.erp.util;

import java.util.List;

public class EasyUiResultUtil<E> {
    private int total;
    private List<E>rows;

    @Override
    public String toString() {
        return "EasyUiResultUtil{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }

    public EasyUiResultUtil() {
    }

    public EasyUiResultUtil(int total, List<E> rows) {
        this.total = total;
        this.rows = rows;
    }
}
