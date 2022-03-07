package co.edu.unbosque.controller;
import co.edu.unbosque.model.Ficha;
import co.edu.unbosque.model.Tablero;
import co.edu.unbosque.model.Zona;
import co.edu.unbosque.view.Ventana;

public class Controller {

	private Ventana view;
	private Tablero tablero;
	
	public Controller() {
		view = new Ventana();
		tablero = new Tablero();
		funcionar();
	}

	private void funcionar() {
		try {
			int menu = 0;
			do {
				menu = view.leerDato("" + 
			           "\n Selecciona la opcion a realizar" + 
					   "\n 1. " +
			           "\n 0. Salir");
				
				switch(menu) {
					case 1:
						tablero.addZona(new Zona("Azul"));
						tablero.addZona(new Zona("Rojo"));
						break;
						
					case 2:
						boolean win = false;
						do {
							for(Zona zona : tablero.getZonas()) {
								int primerDado = tablero.numeroDado();
								int segundoDado = tablero.numeroDado();
								System.out.println("Primer = " + primerDado + " segundo = " + segundoDado);
								if(primerDado >= 5 || segundoDado >= 5) {
									Ficha ficha = zona.sacarFichaZona();
									if(ficha != null) {
										if(primerDado >= 5) {
											ficha.setPosicion(ficha.getPosicion() + (primerDado -5));
										}else {
											ficha.setPosicion(ficha.getPosicion() + (segundoDado -5));
										}
										System.out.println(zona.toString());
									}else {
										return;
									}
								}
							}
						}while(!win);
						break;
				}
			}while(menu != 0);
		} catch(NumberFormatException formato) {
			view.errorMessage("No debes ingresar letras, ni simbolos dentro del menu");
			funcionar();
		}
	}	
}