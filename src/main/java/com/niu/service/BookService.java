package com.niu.service;

import com.niu.entity.Book;
import com.niu.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ami on 2019/6/15.
 */
@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBookById(book);
    }

    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
