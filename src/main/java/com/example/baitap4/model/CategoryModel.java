package com.example.baitap4.model;

import com.example.baitap4.entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean save(Category obj);

    boolean create(Category obj);
    boolean update(int id, Category obj);
    boolean delete(int id);
    Category findById(int id);
    List<Category> findAll();
}
