package com.book.book.service;

import java.util.ArrayList;
import java.util.List;

import com.book.book.model.Book;

import org.springframework.stereotype.Service;
@Service
public class BookService {
    private static List<Book> list = new ArrayList<>();
    static{
        list.add(new Book(110, "English", 1991d));
        list.add(new Book(111, "Science", 13331d));
        list.add(new Book(112, "SANSkrit", 133991d));
        list.add(new Book(113, "Loveh", 193391d));
        list.add(new Book(114, "Poloiy", 1933391d));
    }
    //get all book
    public List<Book> getAllBook(){
        return list;
    }
    //get single by id
    public Book getBookById(int id){
        Book book=null;
       book= list.stream().filter(e->e.getBookId()==id).findFirst().get();
        return book;
        
    }
}
