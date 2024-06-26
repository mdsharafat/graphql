package com.spring.graphql.entity;

import jakarta.persistence.*;
import lombok.*;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 29 Mar, 2024 at 9:50 AM
 ******************************************
 */

@Entity
@Table(name = "project_books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int page;
}
