package com.example.mine.service;

import com.example.mine.domain.Book;

import java.util.List;

public interface BookService {

    /**
     * 查询所有书籍
     * @return
     */
    List<Book> findAll();

    /**
     * 通过书名查询
     * * @param name
     * @return
     */
    List<Book> findByName(String name);

    /**
     * 查询书籍详情
     * * @param id
     * @return
     */
    Book findById(Integer id);

    /**
     * 添加书籍
     * @param book
     * @return
     */
    Book saveBook(Book book);

    /**
     * 修改书籍
     * @param book
     * @return
     */
    Book updateBook(Book book);

    /**
     * 删除书籍
     * @param id
     * @return
     */
    int deleteBook(Integer id);
}
