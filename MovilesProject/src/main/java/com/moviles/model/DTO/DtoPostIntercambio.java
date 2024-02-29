package com.moviles.model.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoPostIntercambio {

    private int idUsuario;
    private int referencia;
    private Date date;
    private String estado;
    private String estadoMinimo;
}
