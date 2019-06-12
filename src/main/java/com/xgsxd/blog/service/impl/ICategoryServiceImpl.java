package com.xgsxd.blog.service.impl;

import com.xgsxd.blog.bean.Category;
import com.xgsxd.blog.dao.CategoryMapper;
import com.xgsxd.blog.service.ICategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ICategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategoryList() {
        return  null   ;
    }

    @Override
    @Transactional
    public int insertCategory(Category category) {

        return 0;
    }

}
