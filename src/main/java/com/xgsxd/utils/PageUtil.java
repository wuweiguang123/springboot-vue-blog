package com.xgsxd.utils;

public class PageUtil {

    /**
     * 计算总页数
     *
     * @param rows 总条数
     * @param pageSize 每页有多少条记录
     * @return
     */
    public static int countTotalPage(int rows, int pageSize){

        return rows%pageSize == 0 ? rows/pageSize :  rows/pageSize+1;
    }

    public static int countCurrentPage(Integer currentPage){
        if (currentPage == null){
            currentPage = 0;
        }

        return currentPage == 0 ? 1 : currentPage;
    }

    public static int countStart(int pageSize, int currentPage){

        return pageSize * (currentPage - 1);
    }

}
