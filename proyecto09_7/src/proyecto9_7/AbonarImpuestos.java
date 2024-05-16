package proyecto9_7;

import java.util.Scanner;

public class AbonarImpuestos {
	/**
	 * Problema:
	Ingresar el sueldo de una persona,
	si supera los 3000 pesos mostrar
	un mensaje en pantalla indicando que debe abonar
	impuestos.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double sueldo = 0;
		double montoImpositivo = 3000;

		System.out.print("Ingrese sueldo a cobrar :");
		sueldo = teclado.nextDouble();

		if (sueldo > montoImpositivo) { // condicional simple
			System.out.print("Ustede debe pagar Impuestos");


		}

	}

}

