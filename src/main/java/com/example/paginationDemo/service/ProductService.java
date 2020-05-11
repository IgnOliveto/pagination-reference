package com.example.paginationDemo.service;

import com.example.paginationDemo.Repository.ProductRepository;
import com.example.paginationDemo.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public Page<ProductDto> getCurrentChecklists(Pageable pageable) {
        return productRepository.findAll(pageable).map(ProductDto::from);
    }

}
