package com.neuedu.pojo;

import com.neuedu.util.Column;

/**
 * Create by Jia on 2020/2/19/019 19:21
 */
public class Dept {
    private Integer deptno;
    private String dname;
    @Column("loc")
    private String loction;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoction() {
        return loction;
    }

    public void setLoction(String loction) {
        this.loction = loction;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loction='" + loction + '\'' +
                '}';
    }
}
