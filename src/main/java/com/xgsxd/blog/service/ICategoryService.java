package com.xgsxd.blog.service;

import com.xgsxd.blog.bean.Category;

import java.util.List;

public interface ICategoryService {

    public List<Category> queryCategoryList();

    public int insertCategory(Category category);

}
