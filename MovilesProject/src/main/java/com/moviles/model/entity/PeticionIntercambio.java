package com.moviles.model.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("peticionIntercambio")
public class PeticionIntercambio extends Peticion {

    @Field("solicitante")
    private Usuario solicitante;
    @Field("postIntercambio")
    private PostIntercambio postIntercambio;
    @Field("postIntercambioSolicitante")
    private PostIntercambio postIntercambioSolicitante;
    
	public PeticionIntercambio(Usuario user, Usuario solicitante,
			PostIntercambio postIntercambio, PostIntercambio postIntercambioSolicitante) {
		super(user);
		this.solicitante = solicitante;
		this.postIntercambio = postIntercambio;
		this.postIntercambioSolicitante = postIntercambioSolicitante;
	}
    
    
    
    

}
