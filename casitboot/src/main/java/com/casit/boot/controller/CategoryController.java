package com.casit.boot.controller;

import com.casit.boot.bean.Category;
import com.casit.boot.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CategoryController {
    @Autowired
    categoryService service;
    //获取所有
    @GetMapping("/category")
    public String categorys(Model model){
        model.addAttribute("categorys",service.list());
        return "categorys";
    }
    //获取单个
    @GetMapping("/category/{name_}")
    public String get(@PathVariable("name_") String name_, Model model){
        Category category=new Category();
        category.setName(name_);
        model.addAttribute("categorys",service.get(category));
        return "categorys";
    }
    //增加
    @PostMapping("/category")
    public String add(Category category){
        service.add(category);
        return "redirect:/category";
    }
    //编辑
    @PutMapping("/category")
    public String update(){
        return "update";
    }
    //删除
    @DeleteMapping("/category/{id}")
    public String delete(){
        return "redirect/category";
    }
}
