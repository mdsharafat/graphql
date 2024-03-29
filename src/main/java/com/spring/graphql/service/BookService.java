package com.spring.graphql.service;

import com.spring.graphql.entity.Book;

import java.util.List;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 10:04 AM
 ******************************************
 */
public interface BookService {
    Book create(Book book);

    List<Book> getAll();

    Book get(Integer bookId);
}
