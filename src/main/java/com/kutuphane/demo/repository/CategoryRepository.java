package com.kutuphane.demo.repository;

import com.kutuphane.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
