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
    @Field("user")
    private Usuario user;
    @Field("referencia")
    private Long referencia;
    @Field("idMovilVenta")
    private Long referenciaMovil;
    @Field("estado")
    private String estado;
    @Field("fechaCreacion")
    private String date;

    public Post(Usuario user, Long referencia,Long referenciaMovil, String estado, String date) {
        this.user = user;
        this.referencia = referencia;
        this.referenciaMovil = referenciaMovil;
        this.estado = estado;
        this.date = date;
    }

	public Post(Long referencia, Long referenciaMovil, String estado, String date) {
		super();
		this.referencia = referencia;
		this.referenciaMovil = referenciaMovil;
		this.estado = estado;
		this.date = date;
	}
    
    

}
