package com.book.book.service;

import java.util.List;
import java.util.Optional;

import com.book.book.model.Book;
import com.book.book.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // get all book
    public List<Book> getAllBook() {
        System.out.println("hit by client");
        List<Book> list = this.bookRepository.findAll();
        return list;
    }

    // get single by id
    public Optional<Book> getBookById(int id) {
        Optional<Book> book = null;

        try {
            // System.out.println("hit by client");
            // book= list.stream().filter(e->e.getBookId()==id).findFirst().get();
            book =  this.bookRepository.findById(id);
            return book;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;

    }

    public Book addBook(Book book) {
        // list.add(book);
        System.out.println("hit by client");
        Book booknew = this.bookRepository.save(book);
        return booknew;
    }

    public void deleteBook(int id) {
        // list = list.stream().filter(book -> book.getBookId() != id
        // {
        // if(book.getBookId()!=id){
        // return true;
        // }else{
        // return false;
        // }
        // }
        // ).collect(Collectors.toList());
          bookRepository.deleteById(id);
    }

    // update book
    public void updateBook(Book book, int bookId) {
    //     list.stream().map(b -> {
    //         if (b.getBookId() == bookId) {
    //             b.setBookName(book.getBookName());
    //             b.setBookPrice(book.getBookPrice());
    //         }
    //         return b;

    //     }).collect(Collectors.toList());

    // }
    book.setBookId(bookId);;
    bookRepository.save(book);

}

	public void addAll(List<Book> book) {
	}}
