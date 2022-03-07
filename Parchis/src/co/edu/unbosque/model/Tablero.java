package co.edu.unbosque.model;
import java.util.ArrayList;

public class Tablero {
	
	private ArrayList <Zona> zonas;
	private Casilla [] casillas;
	
	public Tablero() {
		zonas = new ArrayList <> ();
		casillas = new Casilla [120];
	}
	
	public void addZona(Zona zona) {
		zonas.add(zona);
	}
	
	public int numeroDado() {
		return (int) Math.round(Math.random()*5+1);
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public Casilla[] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[] casillas) {
		this.casillas = casillas;
	}
}