package com.example.mine.repository;

import com.example.mine.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("SELECT b from Book b where b.bookName = :name")
    List<Book> findAllByBookName(@Param("name") String name);
}
