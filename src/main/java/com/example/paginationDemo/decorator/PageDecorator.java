package com.example.paginationDemo.decorator;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PageDecorator {
    private final Page page;


    public List getContent() {
        return this.page.getContent();
    }

    public PageDecorator(Page page) {
        this.page = page;
    }

    public int getTotalPages() {
        return page.getTotalPages();
    }

    public long getTotalElements() {
        return page.getTotalElements();
    }

    public int getNumber(){
        return page.getNumber();
    }

    @JsonProperty("limit")
    public int getLimit(){
        return page.getSize();
    }

    public  Pageable getPageable (){
        return page.getPageable();
    }

    public boolean isLast (){
        return page.isLast();
    }

    public int getNumberOfElements(){
        return page.getNumberOfElements();
    }

    public boolean isFirst(){
        return page.isFirst();
    }

    public boolean isEmpty(){
        return page.isEmpty();
    }

}
