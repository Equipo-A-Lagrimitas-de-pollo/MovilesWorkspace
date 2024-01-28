package com.moviles.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Intervalo {
	private double min;
	private double max;
	
	public Intervalo(double min, double max) {
		this.min=min;
		this.max=max;
	}
}
