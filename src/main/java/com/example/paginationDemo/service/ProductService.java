package com.example.paginationDemo.service;

import com.example.paginationDemo.Repository.ProductRepository;
import com.example.paginationDemo.decorator.PageDecorator;
import com.example.paginationDemo.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private PagedResourcesAssembler<ProductDto> pagedAssembler;

    @Autowired
    ProductRepository productRepository;

    public PageDecorator getCurrentChecklists(Pageable pageable) {
        Page<ProductDto> productPage = productRepository.findAll(pageable).map(ProductDto::from);
        return new PageDecorator(productPage, pagedAssembler.toModel(productPage).getLinks());
    }

}
