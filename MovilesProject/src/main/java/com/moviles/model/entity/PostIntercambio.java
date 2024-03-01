package com.moviles.model.entity;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document("postIntercambio")
public class PostIntercambio extends Post {

    @Field("estadoMinimo")
    private String estadoMinimo;

    public PostIntercambio(String emailUsuario, Long referencia,Long referenciaMovil,  String estado, Date date,
            String estadoMinimo) {
        super(emailUsuario, referencia,referenciaMovil, estado, date);
        this.estadoMinimo = estadoMinimo;
    }

    public PostIntercambio(String estadoMinimo) {
        this.estadoMinimo = estadoMinimo;
    }

}
