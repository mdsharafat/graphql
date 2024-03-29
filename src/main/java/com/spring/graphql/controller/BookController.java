package com.spring.graphql.controller;

import com.spring.graphql.entity.Book;
import com.spring.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
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
    public Book create(@RequestBody Book book) {
        return this.bookService.create(book);
    }

//    @RequestMapping(method = RequestMethod.GET)
    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

//    @RequestMapping(value = "/{bookId}", method = RequestMethod.PUT)
    @QueryMapping("getSingleBook")
    public Book get(@Argument Integer bookId) {
        return this.bookService.get(bookId);
    }

}
