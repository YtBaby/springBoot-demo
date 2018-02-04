package com.example.mine.web;

import com.example.mine.domain.Book;
import com.example.mine.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.POST)
    public List<Book> findByName(@RequestParam("name") String name){
        return bookService.findByName(name);
    }

    @PostMapping("/findById")
    public Book findById(@RequestParam("id") Integer id){
        return bookService.findById(id);
    }

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PostMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/deleteBook")
    public int deleteBook(Integer id){
        return bookService.deleteBook(id);
    }
}
