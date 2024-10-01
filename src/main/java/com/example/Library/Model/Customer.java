package com.example.Library.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    //@Column(unique = true)
    private String name;
    private String surname;
    //@ManyToMany
    //private List<Book> borrowedBooks;


}
