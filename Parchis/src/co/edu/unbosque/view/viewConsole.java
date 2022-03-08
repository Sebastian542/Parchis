package co.edu.unbosque.view;

import java.util.Scanner;

public class viewConsole {

	private final Scanner sc;

	public viewConsole() {
		sc = new Scanner(System.in);
	}

	public int lectura() {
		int n = sc.nextInt();
		sc.nextLine();
		return n;
	}

	public String lecturaS() {
		String a = sc.next();
		sc.nextLine();
		return a;
	}

}
