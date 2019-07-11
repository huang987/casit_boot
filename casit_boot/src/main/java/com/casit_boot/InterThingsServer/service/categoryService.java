package com.casit_boot.InterThingsServer.service;

import com.casit_boot.InterThingsServer.bean.Category;

import java.util.List;

public interface categoryService {
    List<Category> list();
    List<Category> get(Category category);
    void add(Category category);
    Category edit(Category category);
    Category delete(Category category);
}
