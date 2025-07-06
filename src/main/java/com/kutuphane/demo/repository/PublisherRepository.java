package com.kutuphane.demo.repository;

import com.kutuphane.demo.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
