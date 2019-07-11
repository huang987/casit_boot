package com.casit_boot.InterThingsServer.service.serviceImpl;
import com.casit_boot.InterThingsServer.bean.Category;
import com.casit_boot.InterThingsServer.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.casit_boot.InterThingsServer.mapper.categoryMapper;
import org.springframework.stereotype.Service;

@Service
public class categoryServiceImpl implements categoryService{
    @Autowired
    categoryMapper mapper;

    @Override
    public List<Category> list() {
        return mapper.list();
    }

    @Override
    public List<Category> get(Category category) {
        return mapper.get(category);
    }

    @Override
    public void add(Category category) {
        mapper.add(category);
    }

    @Override
    public Category edit(Category category) {
        return null;
    }

    @Override
    public Category delete(Category category) {
        return null;
    }
}
