package com.book.book.repository;

import java.util.Optional;

import com.book.book.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
    public Optional<Book> findById(int id);

}
