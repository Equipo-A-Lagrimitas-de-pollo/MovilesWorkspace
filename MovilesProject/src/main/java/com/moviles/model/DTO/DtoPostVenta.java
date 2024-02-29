package com.moviles.model.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DtoPostVenta
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoPostVenta {

    private int idUsuario;
    private int referencia;
    private Date date;
    private String estado;
    private double precio;

}