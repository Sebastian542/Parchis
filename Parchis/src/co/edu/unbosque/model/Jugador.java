package co.edu.unbosque.model;

public class Jugador {
	private int fichas;
	private String color;
	private String tipoJugador;

	public Jugador(String color, int fichas, String tipoJugador) {
		this.color = color;
		this.fichas = fichas;
		this.tipoJugador = tipoJugador;
	}

	public int getFichas() {
		return this.fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public String getTipoJugador() {
		return this.tipoJugador;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTipoJugador(String tipoJugador) {
		this.tipoJugador = tipoJugador;
	}

	@Override
	public String toString() {
		return "{" + " fichas='" + getFichas() + "'" + ", color='" + getColor() + "'" + ", tipoJugador='"
				+ getTipoJugador() + "'" + "}";
	}

}
