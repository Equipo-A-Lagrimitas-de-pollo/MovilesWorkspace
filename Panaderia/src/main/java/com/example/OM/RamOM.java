package com.example.OM;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Ram;

public class RamOM {
	public static List<Ram> getListaRams() {
		List<Ram> listaRams = new ArrayList<>();
		listaRams.add(new Ram("8Gb"));
		listaRams.add(new Ram("16Gb"));
		return listaRams;
	}
}
