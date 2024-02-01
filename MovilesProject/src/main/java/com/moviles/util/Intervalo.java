package com.moviles.util;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Intervalo<T extends Number> {
	private T min;
	private T max;
	
	public Intervalo(T min, T max) {
		this.min=min;
		this.max=max;
	}
}
