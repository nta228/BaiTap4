package com.example.baitap4.model;

import com.example.baitap4.entity.Product;

import java.util.List;

public interface ProductModel {
    boolean create(Product obj);
    boolean update(int id, Product obj);
    boolean delete(int id);
    Product findById(int id);
    List<Product> findAll();
}
