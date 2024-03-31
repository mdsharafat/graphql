package com.spring.graphql.controller;

import com.spring.graphql.entity.Book;
import com.spring.graphql.model.BookInput;
import com.spring.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 10:11 AM
 ******************************************
 */
//@RestController
//@RequestMapping("/books")

@Controller
public class BookController {

    @Autowired
    BookService bookService;

//    @RequestMapping(method = RequestMethod.POST)
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book bookEntity = Book.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .desc(book.getDesc())
                .page(book.getPage())
                .price(book.getPrice())
                .build();
        return this.bookService.create(bookEntity);
    }

//    @RequestMapping(method = RequestMethod.GET)
    @QueryMapping("allBooks")
    public List<Book> getAll() {
        List<Book> books = bookService.getAll();
        return books;
//        return this.bookService.getAll();
    }

//    @RequestMapping(value = "/{bookId}", method = RequestMethod.PUT)
    @QueryMapping("getSingleBook")
    public Book get(@Argument Integer bookId) {
        return this.bookService.get(bookId);
    }

}
