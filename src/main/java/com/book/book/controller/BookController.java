package com.book.book.controller;

import com.book.book.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBook(){
        Book book=new Book();
        book.setBookId(101);
        book.setBookName("math");
        book.setBookPrice(1000d);
        return book;

    }
     

    }

