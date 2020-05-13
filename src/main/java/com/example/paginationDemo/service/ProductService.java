package com.example.paginationDemo.service;

import com.example.paginationDemo.Repository.ProductRepository;
import com.example.paginationDemo.decorator.PageDecorator;
import com.example.paginationDemo.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public PageDecorator getCurrentChecklists(Pageable pageable) {
        return new PageDecorator(productRepository.findAll(pageable).map(ProductDto::from));
    }

}
