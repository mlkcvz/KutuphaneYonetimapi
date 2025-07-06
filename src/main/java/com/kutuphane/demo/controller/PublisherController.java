package com.kutuphane.demo.controller;

import com.kutuphane.demo.dto.PublisherDTO;
import com.kutuphane.demo.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @GetMapping
    public List<PublisherDTO> getAll() {
        return publisherService.getAllPublishers();
    }
}
