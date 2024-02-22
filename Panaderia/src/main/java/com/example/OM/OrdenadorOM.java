package com.example.OM;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.entity.Grafica;
import com.example.entity.Ordenador;
import com.example.entity.Procesador;
import com.example.entity.Ram;

public class OrdenadorOM {
	public List<Ordenador> getListaOrdenadores(){
		List<Ordenador> listaOrdenadores = new ArrayList<>();
		List<Grafica> grafica = GraficaOM.getListaGrafica();
		List<Procesador> procesador = ProcesadorOM.getListaProcesadores();
		List<Ram> ram = RamOM.getListaRams();
		String [] odenadores = {"HP","Apple","Xiaomi","LG"};
		double [] precios = {1500.0,2200.0,1299.99,1600.50};
		Random rnd = new Random();
		for (int i = 0; i < precios.length; i++) {
//			String marca = rnd.toString()+5;
			double precio = rnd.nextDouble(20)+30;
			listaOrdenadores.add(new Ordenador(grafica.get(rnd.nextInt(grafica.size())), procesador.get(rnd.nextInt(procesador.size())), ram.get(rnd.nextInt(ram.size())), odenadores[rnd.nextInt(odenadores.length)], precios[i]));
		//	model.add(new Modelo(modelo[i],procesador.get(rnd.nextInt(procesador.size())), almacenamiento[rnd.nextInt(almacenamiento.length)], RAM[rnd.nextInt(RAM.length)], alto[rnd.nextInt(alto.length)], ancho[rnd.nextInt(ancho.length)], grosor[rnd.nextInt(grosor.length)], peso[rnd.nextInt(peso.length)], camara[rnd.nextInt(camara.length)], bateria[rnd.nextInt(bateria.length)], nfc[rnd.nextInt(nfc.length)], precio, fecha,pulgadas[rnd.nextInt(pulgadas.length)], marcas.get(rnd.nextInt(marcas.size())),tecno.get(rnd.nextInt(tecno.size()))));
		}
		
		return listaOrdenadores;
	}
}


