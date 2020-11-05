package com.banulp.webfluxmongo.webfluxmongo.service;

import com.banulp.webfluxmongo.webfluxmongo.model.Newberry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.CountDownLatch;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Slf4j
@Service
public class BookService {

    @Autowired
    private ReactiveMongoTemplate template;

    public Flux<Newberry> retrieveImpressiveBooks () {

        CountDownLatch latch = new CountDownLatch(1);

//        Disposable subscribe = template.insert(new Newberry("100", "NewKid", "3"))
//                .flatMap(b -> template.findOne(new Query(where("title").is("NewKid")), Newberry.class))
//                .doOnNext(book -> log.info(book.toString()))
//                .subscribe();

        Mono<Newberry> newberryMono = template.findById("1", Newberry.class);

        Flux<Newberry> starBooks = template.findAll(Newberry.class);

        return starBooks;
    }
}
