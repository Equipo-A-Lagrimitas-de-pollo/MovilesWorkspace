package com.moviles.model.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Peticion {
    @Id
    @Field("_id")
    private ObjectId idPeticion;
    // TODO Cambiar por una clase User
    @Field("usuario")
    private Usuario user;
    @Field("referencia")
    private String referencia;
}
