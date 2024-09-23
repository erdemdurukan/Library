package com.example.Library.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    //@Column(unique = true)
    private String name;
    private String surname;
    @Nullable
    private List<Book> borrowedBooks;


}
