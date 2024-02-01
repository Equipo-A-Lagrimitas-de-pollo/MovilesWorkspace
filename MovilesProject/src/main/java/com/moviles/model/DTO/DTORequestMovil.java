package com.moviles.model.DTO;

import java.sql.Date;

import com.moviles.model.entity.MovilKey;
import com.moviles.model.entity.Procesador;
import com.moviles.model.entity.TecnologiaPantalla;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTORequestMovil {

	@NotNull
    private MovilKey key;
    private Procesador procesador;
    private TecnologiaPantalla tecnologiaPantalla;
    private double ancho;
    private double grosor;
    private double alto;
    private double tamanoPantalla;
    private int almacenamiento;
    private int ram;
    private double peso;
    private int megaPixeles;
    private boolean nfc;
    private double precio;
    private Date fechaLanzamiento;
    
}
