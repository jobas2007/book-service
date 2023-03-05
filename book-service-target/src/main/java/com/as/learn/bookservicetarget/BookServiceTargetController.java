package com.as.learn.bookservicetarget;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/target")
@Slf4j
public class BookServiceTargetController {

    @PostMapping
    public Book addNewBook(@RequestHeader("target-request") String header,
                           @RequestBody Book inBook){
        log.info("Incoming - Target Book:{}", inBook);
        log.info("Incoming - Target Book- header:{}", header);
        Book book = new Book();
        book.setTitle(inBook.getTitle());
        book.setAuthor(inBook.getAuthor());

        return book;
    }

    @GetMapping
    public List<Book> getBooks() {
        log.info("Getting - Target Book");
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setTitle("Target Title - JavaScript One");
        book1.setAuthor("Target Author - Fredrick S");
        books.add(book1);
        //
        Book book2 = new Book();
        book2.setTitle("Target Title - Python One");
        book2.setAuthor("Target Author - Micheal B");

        books.add(book2);
        return books;
    }
}
