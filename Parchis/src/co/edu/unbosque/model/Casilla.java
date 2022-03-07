package co.edu.unbosque.model;

public class Casilla {
	
	private Ficha primero;
	private Ficha segundo;
	
	public Casilla() {}
	
	public Casilla(Ficha prim) {
		primero = prim;
	}

	public Ficha getPrimero() {
		return primero;
	}

	public void setPrimero(Ficha primero) {
		this.primero = primero;
	}

	public Ficha getSegundo() {
		return segundo;
	}

	public void setSegundo(Ficha segundo) {
		this.segundo = segundo;
	}
}
