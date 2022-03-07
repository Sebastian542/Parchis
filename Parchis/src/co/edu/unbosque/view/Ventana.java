package co.edu.unbosque.view;
import javax.swing.*;

public class Ventana {

	public Ventana() {}
	
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		return  Integer.parseInt(aux);
	}
	
	public String leerString(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public int rotateDie(String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje, "Siiiu", JOptionPane.YES_OPTION);
	}
	
	public void errorMessage(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Algo esta mal, revisa", JOptionPane.ERROR_MESSAGE);
	}
	
	public void warningMessage(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Peligroooo", JOptionPane.WARNING_MESSAGE);
	}
}
