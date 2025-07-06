package com.kutuphane.demo.service.impl;

import com.kutuphane.demo.dto.PublisherDTO;
import com.kutuphane.demo.entity.Publisher;
import com.kutuphane.demo.repository.PublisherRepository;
import com.kutuphane.demo.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    @Override
    public List<PublisherDTO> getAllPublishers() {
        return publisherRepository.findAll().stream().map(p -> {
            PublisherDTO dto = new PublisherDTO();
            dto.setName(p.getName());
            dto.setPhone(p.getPhone());
            return dto;
        }).collect(Collectors.toList());
    }
}
