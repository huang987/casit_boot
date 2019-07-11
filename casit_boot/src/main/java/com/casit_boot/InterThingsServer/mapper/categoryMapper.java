package com.casit_boot.InterThingsServer.mapper;

import com.casit_boot.InterThingsServer.bean.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface categoryMapper {
    List<Category> list();
    List<Category> get(Category category);
    void add(Category category);
    Category edit(Category category);
    Category delete(Category category);
}
