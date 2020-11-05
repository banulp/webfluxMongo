package com.banulp.webfluxmongo.webfluxmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@ToString
@Document(collection = "newberry")
public class Newberry {

    private String _id;
    private String title;
    private String star;

}
