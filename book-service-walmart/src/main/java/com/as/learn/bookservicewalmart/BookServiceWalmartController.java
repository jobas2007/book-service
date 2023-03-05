package com.as.learn.bookservicewalmart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/walmart")
@Slf4j
public class BookServiceWalmartController {

    @PostMapping
    public Book addNewBook(@RequestHeader("walmart-request") String header,
                           @RequestHeader("Authorization") String auth,
                           @RequestBody Book inBook) {
        log.info("Incoming - Walmart Book:{}", inBook);
        log.info("Incoming - Walmart Book-header:{}", header);
        log.info("Incoming - Walmart Book-auth:{}", auth);
        //log.info("Incoming - Walmart Book-dummy-header:{}", dummy);

        Book book = new Book();
        book.setTitle(inBook.getTitle());
        book.setAuthor(inBook.getAuthor());

        return book;
    }

    @GetMapping
    public List<Book> getBooks() {
        log.info("Getting - Walmart Book");
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setTitle("Walmart Title - Spring One");
        book1.setAuthor("Walmart Author - Ron J");
        books.add(book1);
        //
        Book book2 = new Book();
        book2.setTitle("Walmart Title - Java One");
        book2.setAuthor("Walmart Author - James G");

        books.add(book2);
        return books;
    }
}
