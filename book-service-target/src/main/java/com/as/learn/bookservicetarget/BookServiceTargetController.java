package com.as.learn.bookservicetarget;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/target/books")
@Slf4j
public class BookServiceTargetController {

    @PostMapping("/add")
    public Book addNewBook(@RequestBody Book inBook){
        log.info("Incoming - Target Book:{}", inBook);
        Book book = new Book();
        book.setTitle(inBook.getTitle());
        book.setAuthor(inBook.getAuthor());

        return book;
    }

}
