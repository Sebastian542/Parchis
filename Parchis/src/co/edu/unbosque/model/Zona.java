package co.edu.unbosque.model;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Zona {
	
	private Ficha [] fichas;
	private String color;
	
	public Zona() {}
	
	public Zona(String col) {
		color = col;
		fichas = new Ficha [] {new Ficha(color), new Ficha(color), new Ficha(color), new Ficha(color)};
	}
	
	public Ficha sacarFichaZona() {
		Ficha ficha = null;
		for(Ficha index : fichas)
			if(!index.isAcceso())
				ficha = index;
		if(ficha != null)
			ficha.setAcceso(true);
		return ficha;
	}
	
	public int inicial() {
		Ficha ficha = new Ficha(color);
		return ficha.getPosicion();
	}
	
	public String toString() {
		return Arrays.asList(fichas).stream().map(x -> x.toString()).collect(Collectors.joining("\n"));
	}
}
