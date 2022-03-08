package co.edu.unbosque.model;

public class Ficha {
	private String color;
	private int casilla;
	
	public Ficha(String color, int casilla) {
		this.color = color;
		this.casilla = casilla;
		// Test
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCasilla() {
		return this.casilla;
	}

	public void setCasilla(int casilla) {
		this.casilla = casilla;
	}

	@Override
	public String toString() {
		return "{" + " color='" + getColor() + "'" + ", casilla='" + getCasilla() + "'" + "}";
	}

}
