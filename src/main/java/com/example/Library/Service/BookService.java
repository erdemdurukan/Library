package com.example.Library.Service;

import com.example.Library.Model.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book createBook(Book book);

    public void deleteBook(String uuid);
}
