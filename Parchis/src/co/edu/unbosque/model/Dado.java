package co.edu.unbosque.model;

public class Dado {
	// Generate random int value from 1 to 6
	public int lanzarDados() {
		int min = 1;
		int max = 6;
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return random_int;
	}
}
