package com.spring.graphql.repo;

import com.spring.graphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 10:02 AM
 ******************************************
 */
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
