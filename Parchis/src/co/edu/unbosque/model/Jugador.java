package co.edu.unbosque.model;

@SuppressWarnings("unused")
public class Jugador {
	
	private String nickName;
	private Zona zona;
	
	public Jugador() {}
	
	public Jugador(String apodo, String color) {
		zona = new Zona(color);
		nickName = apodo;
	}	
}
