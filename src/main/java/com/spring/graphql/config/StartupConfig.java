package com.spring.graphql.config;

import com.spring.graphql.entity.Book;
import com.spring.graphql.repo.BookRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 11:03 AM
 ******************************************
 */

@Configuration
@Slf4j
public class StartupConfig {

    @Autowired
    BookRepo bookRepo;

    @EventListener
    @Transactional
    public void prepareData(ApplicationReadyEvent applicationReadyEvent) {
        log.info("********** Startup Config Starts **********");

        Book book1 = new Book();
        book1.setTitle("Java");
        book1.setDesc("Java Programming Language Book");
        book1.setAuthor("Md Sharafat Hossain");
        book1.setPrice(5000);
        book1.setPage(400);
        bookRepo.save(book1);

        Book book2 = new Book();
        book2.setTitle("Python");
        book2.setDesc("Python Programming Language Book");
        book2.setAuthor("Musab Bin Sharafat");
        book2.setPrice(10000);
        book2.setPage(600);
        bookRepo.save(book2);

        Book book3 = new Book();
        book3.setTitle("C++");
        book3.setDesc("C++ Programming Language Book");
        book3.setAuthor("Atiqure Rahman");
        book3.setPrice(4000);
        book3.setPage(300);
        bookRepo.save(book3);

        Book book4 = new Book();
        book4.setTitle("RDBMS");
        book4.setDesc("Database Management System");
        book4.setAuthor("Shahjalal Sakil");
        book4.setPrice(6000);
        book4.setPage(400);
        bookRepo.save(book4);

        Book book5 = new Book();
        book5.setTitle("Software Architecture");
        book5.setDesc("Software Engineering And Complex Architecture");
        book5.setAuthor("Anwarul Islam");
        book5.setPrice(7000);
        book5.setPage(800);
        bookRepo.save(book5);


        log.info("********** Startup Config Ends   **********");
    }


}
