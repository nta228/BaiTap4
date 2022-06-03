package com.example.baitap4.model.seeder;

import com.example.baitap4.entity.Category;
import com.example.baitap4.model.CategoryModel;
import com.example.baitap4.model.MySqlCategoryModel;

public class CategorySeeder {
    private CategoryModel categoryModel;
    public CategorySeeder(){
        this.categoryModel = new MySqlCategoryModel();
    }
    public void seedData(){
        categoryModel.save(Category.CategoryBuilder.aCategory()
                        .withName("đồ bơi nam").build());
        categoryModel.save(Category.CategoryBuilder.aCategory()
                .withName("đồ bơi nữ").build());

    }
}
