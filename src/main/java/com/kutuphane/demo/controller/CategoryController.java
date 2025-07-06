package com.kutuphane.demo.controller;

import com.kutuphane.demo.entity.Category;
import com.kutuphane.demo.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody @Valid Category category) {
        return ResponseEntity.ok(categoryService.saveCategory(category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        String result = categoryService.deleteCategory(id);
        return result.contains("silinemedi") ? ResponseEntity.badRequest().body(result) : ResponseEntity.ok(result);
    }
}
