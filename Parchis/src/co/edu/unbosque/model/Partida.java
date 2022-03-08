package co.edu.unbosque.model;

import java.util.ArrayList;

public class Partida {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private ArrayList<String> tablero = new ArrayList<String>();
	private ArrayList<String> metaB = new ArrayList<String>();
	private ArrayList<String> metaY = new ArrayList<String>();
	private ArrayList<String> metaR = new ArrayList<String>();
	private ArrayList<String> metaG = new ArrayList<String>();
	private ArrayList<Ficha> fichasB = new ArrayList<Ficha>();
	private ArrayList<Ficha> fichasY = new ArrayList<Ficha>();
	private ArrayList<Ficha> fichasR = new ArrayList<Ficha>();
	private ArrayList<Ficha> fichasG = new ArrayList<Ficha>();
	private String turno1, turno2, turno3, turno4;

	public Partida() {
		// Test
	}

	public void dibujarTablero() {
		String colorString = "WHITE";
		int i = 0;
		for (i = 0; i <= 67; i++) {
			tablero.add(colorString);
		}
		for (i = 0; i <= 67; i++) {
			if (i == 4) {
				tablero.set(i, "YELLOW");
			}
			if (i == 21) {
				tablero.set(i, "BLUE");
			}
			if (i == 37) {
				tablero.set(i, "RED");
			}
			if (i == 55) {
				tablero.set(i, "GREEN");
			}
			if ((i == 11 || i == 28) || (i == 45 || i == 62)) {
				tablero.set(i, "SAFE");
			}
			if (i == 16) {
				tablero.set(i, "SAFEBLUE");
			}
			if (i == 33) {
				tablero.set(i, "SAFERED");
			}
			if (i == 50) {
				tablero.set(i, "SAFEGREEN");
			}
			if (i == 67) {
				tablero.set(i, "SAFEYELLOW");
			}
		}
		// System.out.println("TABLERO\n"+tablero);
	}

	public void llenarFichas() {
		Ficha ficha1 = new Ficha("BLUE", -1);
		Ficha ficha2 = new Ficha("YELLOW", -1);
		Ficha ficha3 = new Ficha("RED", -1);
		Ficha ficha4 = new Ficha("GREEN", -1);
		for (int i = 0; i <= 3; i++) {
			fichasB.add(i, ficha1);
		}
		for (int i = 0; i <= 3; i++) {
			fichasY.add(i, ficha2);
		}
		for (int i = 0; i <= 3; i++) {
			fichasR.add(i, ficha3);
		}
		for (int i = 0; i <= 3; i++) {
			fichasG.add(i, ficha4);
		}
		// System.out.println("FICHAS\n");
		// System.out.println(fichasB);
		// System.out.println(fichasY);
		// System.out.println(fichasR);
		// System.out.println(fichasG);
	}

	public void llenarMeta() {
		for (int i = 0; i <= 8; i++) {
			metaB.add("BLUE");
			metaY.add("YELLOW");
			metaR.add("RED");
			metaG.add("GREEN");
		}
	}

	public void llenarJugadores(String color, int ficha, String tipo) {
		Jugador j = new Jugador(color, 4, tipo);
		jugadores.add(j);
		// System.out.println(jugadores);
	}

	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<String> getTablero() {
		return this.tablero;
	}

	public void setTablero(ArrayList<String> tablero) {
		this.tablero = tablero;
	}

	public ArrayList<String> getMetaB() {
		return this.metaB;
	}

	public void setMetaB(ArrayList<String> metaB) {
		this.metaB = metaB;
	}

	public ArrayList<String> getMetaY() {
		return this.metaY;
	}

	public void setMetaY(ArrayList<String> metaY) {
		this.metaY = metaY;
	}

	public ArrayList<String> getMetaR() {
		return this.metaR;
	}

	public void setMetaR(ArrayList<String> metaR) {
		this.metaR = metaR;
	}

	public ArrayList<String> getMetaG() {
		return this.metaG;
	}

	public void setMetaG(ArrayList<String> metaG) {
		this.metaG = metaG;
	}

	public ArrayList<Ficha> getFichasB() {
		return this.fichasB;
	}

	public void setFichasB(ArrayList<Ficha> fichasB) {
		this.fichasB = fichasB;
	}

	public ArrayList<Ficha> getFichasY() {
		return this.fichasY;
	}

	public void setFichasY(ArrayList<Ficha> fichasY) {
		this.fichasY = fichasY;
	}

	public ArrayList<Ficha> getFichasR() {
		return this.fichasR;
	}

	public void setFichasR(ArrayList<Ficha> fichasR) {
		this.fichasR = fichasR;
	}

	public ArrayList<Ficha> getFichasG() {
		return this.fichasG;
	}

	public void setFichasG(ArrayList<Ficha> fichasG) {
		this.fichasG = fichasG;
	}

	public String getTurno1() {
		return this.turno1;
	}

	public void setTurno1(String turno1) {
		this.turno1 = turno1;
	}

	public String getTurno2() {
		return this.turno2;
	}

	public void setTurno2(String turno2) {
		this.turno2 = turno2;
	}

	public String getTurno3() {
		return this.turno3;
	}

	public void setTurno3(String turno3) {
		this.turno3 = turno3;
	}

	public String getTurno4() {
		return this.turno4;
	}

	public void setTurno4(String turno4) {
		this.turno4 = turno4;
	}

	@Override
	public String toString() {
		return "{" + " jugadores='" + getJugadores() + "'" + ", tablero='" + getTablero() + "'" + ", metaB='"
				+ getMetaB() + "'" + ", metaY='" + getMetaY() + "'" + ", metaR='" + getMetaR() + "'" + ", metaG='"
				+ getMetaG() + "'" + ", fichasB='" + getFichasB() + "'" + ", fichasY='" + getFichasY() + "'"
				+ ", fichasR='" + getFichasR() + "'" + ", fichasG='" + getFichasG() + "'" + "}";
	}

}
