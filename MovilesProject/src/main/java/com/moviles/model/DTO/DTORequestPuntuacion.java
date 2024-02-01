package com.moviles.model.DTO;

import com.moviles.model.entity.MovilKey;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTORequestPuntuacion {
    @NotNull
    private MovilKey key;
    @Positive
    @Min(value = 0)
    @Max(value = 10)
    private int puntuacion;

}
