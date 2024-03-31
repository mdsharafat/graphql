package com.spring.graphql.model;

import lombok.*;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 31 Mar, 2024 at 11:31 AM
 ******************************************
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookInput {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int page;
}
