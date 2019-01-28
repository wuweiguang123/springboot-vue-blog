package com.xgsxd.utils;

import java.util.List;

public class Page {

    private Integer pageSize; //每页显示的记录数
    private Integer currentPage; //当前页
    private Integer start; //每页从第几条数据开始显示
    private Integer totalPage; //最大记录数
    private Integer rows; //总条数

    private List<?> pageData; //数据

    public Page(Integer pageSize, Integer currentPage, Integer rows) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.rows = rows;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getStart() {

        return PageUtil.countStart(this.pageSize,this.currentPage);
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getTotalPage() {
        return PageUtil.countTotalPage(this.rows, this.pageSize);
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public List<?> getPageData() {
        return pageData;
    }

    public void setPageData(List<?> pageData) {
        this.pageData = pageData;
    }
}