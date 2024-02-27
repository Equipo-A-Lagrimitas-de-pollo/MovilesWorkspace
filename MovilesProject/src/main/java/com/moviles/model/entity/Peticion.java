package com.moviles.model.entity;

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
    private String idPeticion;
    // TODO Cambiar por una clase User
    @Field("usuario")
    private Usuario user;
}
