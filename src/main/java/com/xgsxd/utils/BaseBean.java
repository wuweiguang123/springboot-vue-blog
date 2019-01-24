package com.xgsxd.utils;

import java.io.Serializable;

/**
 * 所有实体类的父类（需要分页情况下）
 *
 */
public class BaseBean implements Serializable {

    private Integer start; //起始下标

    private Integer length; //每页有几条


    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
