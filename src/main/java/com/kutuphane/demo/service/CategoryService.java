package com.kutuphane.demo.service;

import com.kutuphane.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category saveCategory(Category category);
    String deleteCategory(Long id);
}
