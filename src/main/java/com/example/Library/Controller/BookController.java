package com.example.Library.Controller;

import com.example.Library.Model.Book;
import com.example.Library.Repository.BookRepository;
import com.example.Library.Service.BookService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/book")
public class BookController {

    private BookService bookService;

    @GetMapping("/getAllBooks")
    public List<Book> GetAllBooks(){
        return bookService.getAllBooks();
    }
    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);

    }

    @DeleteMapping("/deleteBook")
    public Book deleteBookByName(@RequestBody String  bookName){
        //Optional<Book> a = bookRepository.findByName(bookName);

       return null;
        // bookRepository.delete(a);


    }

}
