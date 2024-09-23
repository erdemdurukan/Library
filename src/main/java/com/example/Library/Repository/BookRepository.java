package com.example.Library.Repository;

import com.example.Library.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository< Book,String > {
    Optional<Book> findByName(String name);

}
