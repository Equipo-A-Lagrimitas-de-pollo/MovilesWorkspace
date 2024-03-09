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
    protected Usuario user;
    @Field("referencia")
    protected String referencia;
    protected boolean aceptada = false;
    
	public Peticion(Usuario user) {
		super();
		this.user = user;
	}
	
	public boolean isSameUser(String name) {
		return user.getUsername().equals(name);
	}
    
    
    
    
}
