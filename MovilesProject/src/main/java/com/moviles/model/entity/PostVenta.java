package com.moviles.model.entity;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
// ¿Esto esta bien?
@Document("postVenta")
public class PostVenta extends Post {
    @Field("precio")
    private double precio;

    public PostVenta(String userName, Long referencia,Long referenciaMovil, String estado, Date date, double precio) {
        super(userName, referencia,referenciaMovil, estado, date);
        this.precio = precio;
    }

    public PostVenta(double precio) {
        this.precio = precio;
    }

}
