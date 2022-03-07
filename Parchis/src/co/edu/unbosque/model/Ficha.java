package co.edu.unbosque.model;

public class Ficha {
	
	private String color;
	private int posicion;
	private boolean acceso;
	
	public Ficha() {}
	
	public Ficha(String col) {
		color = col;
		posicion = posicionInicial();
		acceso = false;
	}
	
	public int posicionInicial() {
		switch(color) {
			case "Amarillo":
				return 5;
			case "Azul":
				return 22;
			case "Rojo":
				return 39;
			case "Verde":
				return 56;
				default:
					return 0;
		}
	}
	
	public String toString() {
		return "Color: " + color + "\n" + 
               "Posicion: " + posicion + "\n" +
			   "Acceso: " + acceso;	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isAcceso() {
		return acceso;
	}

	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}	
}