package com.as.learn.bookservicewalmart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/walmart/books")
@Slf4j
public class BookServiceWalmartController {

    @PostMapping("/add")
    public Book addNewBook(@RequestBody Book inBook){
        log.info("Incoming - Walmart Book:{}", inBook);
        Book book = new Book();
        book.setTitle(inBook.getTitle());
        book.setAuthor(inBook.getAuthor());

        return book;
    }

}
