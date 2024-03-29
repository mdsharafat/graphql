package com.spring.graphql.service;

import com.spring.graphql.entity.Book;
import com.spring.graphql.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 10:05 AM
 ******************************************
 */

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(Integer bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> {
            return new RuntimeException("Book not found");
        });
    }
}
