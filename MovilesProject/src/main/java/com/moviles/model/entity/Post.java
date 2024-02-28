package com.moviles.model.entity;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Post {
    @Id
    @Field("_id")
    private ObjectId idAnuncio;
    @Field("idUsuario")
    private int idUsuario;
    @Field("referencia")
    private int referencia;
    @Field("idMovilVenta")
    private String estado;
    @Field("fechaCreacion")
    private Date date;

}
