package com.example.paginationDemo.controller;

import com.example.paginationDemo.decorator.PageDecorator;
import com.example.paginationDemo.model.dto.ProductDto;
import com.example.paginationDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<PageDecorator> getCurrentChecklists(Pageable pageable) {
        return new ResponseEntity(productService.getCurrentChecklists(pageable), HttpStatus.OK);
    }


}
