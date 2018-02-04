package com.example.mine.service.impl;

import com.example.mine.domain.Book;
import com.example.mine.repository.BookRepository;
import com.example.mine.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findAllByBookName(name);
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    @Transactional
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public Book updateBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    @Transactional
    public int deleteBook(Integer id) {
        bookRepository.delete(id);
        return 1;
    }
}
