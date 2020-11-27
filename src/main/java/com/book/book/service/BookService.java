package com.book.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("hit by client");
        return list;
    }
    //get single by id
    public Book getBookById(int id){
        Book book=null;
        System.out.println("hit by client");
       book= list.stream().filter(e->e.getBookId()==id).findFirst().get();
        return book;
        
    }
	public Book addBook(Book book) {
        list.add(book);
        System.out.println("hit by client");
        return book;
	}
	public void deleteBook(int id) {
        list = list.stream().filter(book->book.getBookId()!=id
        // {
        //     if(book.getBookId()!=id){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }
        ).collect(Collectors.toList());
      
    }

    //update book
	public void updateBook(Book book,int bookId) {
        list.stream().map(b->{
            if(b.getBookId()==bookId){
                b.setBookName(book.getBookName());
                b.setBookPrice(book.getBookPrice());
            }
            return b;

        }).collect(Collectors.toList());
         
	}
     
}
