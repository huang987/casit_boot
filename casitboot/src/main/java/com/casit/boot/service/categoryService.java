package com.casit.boot.service;

import com.casit.boot.bean.Category;

import java.util.List;

public interface categoryService {
    List<Category> list();
    List<Category> get(Category category);
    void add(Category category);
    Category edit(Category category);
    Category delete(Category category);
}
