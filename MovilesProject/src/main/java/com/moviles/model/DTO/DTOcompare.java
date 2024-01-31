package com.moviles.model.DTO;

import com.moviles.model.entity.MovilKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOcompare {

    private MovilKey key1;
    private MovilKey key2;

}
