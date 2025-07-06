package com.kutuphane.demo.service.impl;

import com.kutuphane.demo.entity.Category;
import com.kutuphane.demo.repository.CategoryRepository;
import com.kutuphane.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long id) {
        return categoryRepository.findById(id)
            .map(category -> {
                if (!category.getBooks().isEmpty()) {
                    return "Bu kategoriye ait kitap var. Bu kategori silinemedi.";
                }
                categoryRepository.delete(category);
                return "Kategori başarıyla silindi.";
            })
            .orElse("Kategori bulunamadı.");
    }
}
