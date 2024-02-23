package com.moviles.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("postIntercambio")
public class PostIntercambio extends Post {

    @Field("estadoMinimo")
    private String estadoMinimo;
}
