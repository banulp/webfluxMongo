package com.banulp.webfluxmongo.webfluxmongo.controller;

import com.banulp.webfluxmongo.webfluxmongo.model.Newberry;
import com.banulp.webfluxmongo.webfluxmongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "banulp.mo", produces = "application/json;charset=UTF-8")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getImpressiveBooks")
    public Flux<Newberry> getImpressiveBooks() {
        Flux<Newberry> books = bookService.retrieveImpressiveBooks();
        return books;
    }

}
