package com.example.Library.Service;

import com.example.Library.Model.Book;
import com.example.Library.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookService {


    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(String uuid) {
        bookRepository.deleteById(uuid);
    }
}
