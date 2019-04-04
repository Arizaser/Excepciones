package ejercicio1Excep;
import utiles.Teclado;

/**
	* Realiza un programa que pida 6 n�meros por teclado y nos diga cu�l es el
	* m�ximo. Si el usuario introduce un dato err�neo (algo que no sea un n�mero
	* entero) el programa debe indicarlo y debe pedir de nuevo el n�mero
	*/

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] num = new int[6];
		Scanner sc = new Scanner(System.in);
		int max = 0;
		boolean leido;

		do {
			System.out.println();
			System.out.println("Introduzca numeros enteros: ");
			try {
				for (int i = 0; i < num.length; i++) {
					num[i] = sc.nextInt();
					if (num[i] > max) {
						max = num[i];
					}
				}
				System.out.println("El numero mayor es " + max);
				leido = true;
			} catch (Exception e) {
				leido = false;
				System.err.println("El dato introducido no es correcto, debe ser un n�mero entero.");
				System.err.println("Por favor, int�ntelo de nuevo.");
				sc.nextLine();
			}
		} while (!leido);
	}

}
