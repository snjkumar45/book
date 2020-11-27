package com.book.book.controller;

import java.util.List;

import com.book.book.model.Book;
import com.book.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBook(){
        
        // Book book=new Book();
        // book.setBookId(101);
        // book.setBookName("math");
        // book.setBookPrice(1000d);
        return this.bookService.getAllBook();

    }
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id){
        return this.bookService.getBookById(id);
        
    }
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        Book addBook = this.bookService.addBook(book);
        return addBook;

    }
    @DeleteMapping("book/{id}")
    public String deleteBook(@PathVariable int id){
        System.out.println("hit by client");
        this.bookService.deleteBook(id);
        return "id";

    }
     

    }

