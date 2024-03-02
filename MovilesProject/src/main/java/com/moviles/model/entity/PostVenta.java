package com.moviles.model.entity;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document("postVenta")
public class PostVenta extends Post {
    @Field("precio")
    private double precio;

    public PostVenta(Long referencia,Long referenciaMovil, String estado, String date, double precio) {
        super(referencia,referenciaMovil, estado, date);
        this.precio = precio;
    }

    public PostVenta(double precio) {
        this.precio = precio;
    }

}
