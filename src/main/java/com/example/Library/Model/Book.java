package com.example.Library.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    //@Column(unique = true)
    private String name;
    private int numberOfPages;
    private String author;
    private int edition;
    private String language;


}
