package com.example.paginationDemo.decorator;

import org.springframework.data.domain.Page;

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

    public int getCurrentPage() {
        return page.getNumber() + 1;
    }

    public int getLimit() {
        return page.getSize();
    }

    public boolean isLast() {
        return page.isLast();
    }

    public int getNumberOfElements() {
        return page.getNumberOfElements();
    }

    public boolean isFirst() {
        return page.isFirst();
    }

    public boolean isEmpty() {
        return page.isEmpty();
    }

    public int getPreviousPage() {
        return page.previousOrFirstPageable().getPageNumber() + 1;
    }

    public int nextPage() {
        return page.nextOrLastPageable().getPageNumber() + 1;
    }

    //TODO: ADD LINKS AND OFFSET

}
