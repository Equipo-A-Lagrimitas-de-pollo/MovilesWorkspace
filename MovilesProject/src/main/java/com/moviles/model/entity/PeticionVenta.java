package com.moviles.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("peticionVenta")
public class PeticionVenta extends Peticion {

    @Field("solicitante")
    private Usuario solicitante;
    @Field("peticionVenta")
    private PostVenta postVenta;

}
