package com.moviles.model.entity;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// ¿Esto esta bien?
@Document("postVenta")
public class PostVenta extends Post {
    @Field("precio")
    private double precio;

    public PostVenta(String idAnuncio, int idUsuario, int referencia, String estado, Date date, double precio) {
        super(idAnuncio, idUsuario, referencia, estado, date);
        this.precio = precio;
    }

}
