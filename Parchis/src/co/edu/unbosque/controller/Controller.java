package co.edu.unbosque.controller;

import co.edu.unbosque.model.Dado;
import co.edu.unbosque.model.Ficha;
import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.model.Partida;
import co.edu.unbosque.view.viewConsole;

public class Controller {
	private Partida part;
	private Jugador jg;
	private Ficha fic;
	private Dado dado1, dado2;
	private viewConsole vc;

	public Controller() {
		dado1 = new Dado();
		dado2 = new Dado();
		jg = new Jugador("", 4, "");
		part = new Partida();
		vc = new viewConsole();
		funcionar();
	}

	public void funcionar() {
		String aux, resp = "";
		String dadox, jugx = "";
		int b = 0;
		int y = 0;
		int r = 0;
		int g = 0;
		int j = 0;
		int b2 = 0;
		int y2 = 0;
		int r2 = 0;
		int g2 = 0;
		int dt = 0;
		int cas = 0;// Contadores
		int d1, d2 = 0;
		boolean salidaB = false;
		boolean salidaY = false;
		boolean salidaR = false;
		boolean salidaG = false;
		boolean match;
		part = new Partida();
		System.out.println("TABLERO\n");
		part.dibujarTablero();
		System.out.println("FICHAS\n");
		part.llenarFichas();
		System.out.println("ASIGNAR JUGADORES? s / n");
		aux = vc.lecturaS();
		if (aux.equals("s")) {
			System.out.println("BLUE: H or M");
			aux = vc.lecturaS();
			part.llenarJugadores("BLUE", 4, aux);
			//
			System.out.println("YELLOW: H or M");
			aux = vc.lecturaS();
			part.llenarJugadores("YELLOW", 4, aux);
			//
			System.out.println("RED: H or M");
			aux = vc.lecturaS();
			part.llenarJugadores("RED", 4, aux);
			//
			System.out.println("GREEN: H or M");
			aux = vc.lecturaS();
			part.llenarJugadores("GREEN", 4, aux);

		} else if (aux.equals("n")) {
			part.llenarJugadores("BLUE", 4, "IA");
			part.llenarJugadores("YELLOW", 4, "IA");
			part.llenarJugadores("RED", 4, "IA");
			part.llenarJugadores("GREEN", 4, "IA");
		}

		match = true;
		while (match == true) {
			jugx = part.getJugadores().get(j).getColor();
			System.out.println("Jugador " + j + " " + jugx + ":" + "lanze los dados s / n");
			dadox = vc.lecturaS();
			dadox.toLowerCase();
			if (dadox.equals("s")) {
				d1 = dado1.lanzarDados();
				d2 = dado2.lanzarDados();
				System.out.println("DADO1: " + d1 + "\nDADO2: " + d2);
				if (d1 == d2) {// Pair
					System.out.println("Jugador " + jugx + " Avance a la salida");
					if (jugx.equalsIgnoreCase("BLUE")) {
						Ficha f = new Ficha(jugx, 21);
						part.getFichasB().set(b, f);
						salidaB = true;
						b++;
						if (b >= 3) {
							b = 0;
						}
					}
					if (jugx.equalsIgnoreCase("YELLOW")) {
						Ficha f = new Ficha(jugx, 4);
						part.getFichasY().set(y, f);
						salidaY = true;
						y++;
						if (y >= 3) {
							y = 0;
						}
					}
					if (jugx.equalsIgnoreCase("RED")) {
						Ficha f = new Ficha(jugx, 37);
						part.getFichasR().set(r, f);
						salidaR = true;
						r++;
						if (r >= 3) {
							r = 0;
						}
					}
					if (jugx.equalsIgnoreCase("GREEN")) {
						Ficha f = new Ficha(jugx, 55);
						part.getFichasG().set(g, f);
						salidaG = true;
						g++;
						if (g >= 3) {
							g = 0;
						}
					}

				} else if (d1 != d2) {/* SI DADOS NO ES PAR */
					dt = d1 + d2;
					if (jugx.equalsIgnoreCase("BLUE") && salidaB == true) {
						System.out.println("Jugador " + jugx + " avanza " + dt + " casillas");
						cas = part.getFichasB().get(b2).getCasilla();
						int sum = cas + dt;
						if (cas != -1) {
							Ficha f = new Ficha(jugx, sum);
							part.getFichasB().set(b2, f);
						}
						b2++;
						if (b2 > 3) {
							b2 = 0;
						}
					}

					dt = d1 + d2;
					if (jugx.equalsIgnoreCase("YELLOW") && salidaY == true) {
						System.out.println("Jugador " + jugx + " avanza " + dt + " casillas");
						cas = part.getFichasY().get(y2).getCasilla();
						int sum = cas + dt;
						if (cas != -1) {
							Ficha f = new Ficha(jugx, sum);
							part.getFichasY().set(y2, f);
						}
						y2++;
						if (y2 > 3) {
							y2 = 0;
						}
					}
					if (jugx.equalsIgnoreCase("RED") && salidaR == true) {
						System.out.println("Jugador " + jugx + " avanza " + dt + " casillas");
						cas = part.getFichasR().get(r2).getCasilla();
						int sum = cas + dt;
						if (cas != -1) {
							Ficha f = new Ficha(jugx, sum);
							part.getFichasR().set(r2, f);
						}
						r2++;
						if (r2 > 3) {
							r2 = 0;
						}
					}
					if (jugx.equalsIgnoreCase("GREEN") && salidaG == true) {
						System.out.println("Jugador " + jugx + " avanza " + dt + " casillas");
						cas = part.getFichasG().get(g2).getCasilla();
						int sum = cas + dt;
						if (cas != -1) {
							Ficha f = new Ficha(jugx, sum);
							part.getFichasG().set(g2, f);
						}
						g2++;
						if (g2 > 3) {
							g2 = 0;
						}
					}
				} /* else */
				System.out.println(part.getFichasB());
				System.out.println(part.getFichasY());
				System.out.println(part.getFichasR());
				System.out.println(part.getFichasG());

			}

			if (dadox.equals("n")) {
				System.out.println("Jugador " + jugx + "cediste el turno");
			}

			if (dadox.equals("q")) {
				match = false;
			}

			j++;
			if (j > 3) {
				j = 0;
			}

		} /* WHILE */

	}/* fUNCIONAR */

}