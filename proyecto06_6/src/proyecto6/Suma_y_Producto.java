package proyecto6;

import java.util.Scanner;

public class Suma_y_Producto {
	/**
	 * Escribir un programa en el cual se ingresen cuatro números, calcular e informar la
	suma de los dos primeros y el producto del tercero y el cuarto.
	 */
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int valor1, valor2, valor3, valor4, suma, producto;


		System.out.print("Ingrese primer valor: ");
		valor1 = teclado.nextInt();

		System.out.print("Ingrese segundo valor: ");
		valor2 = teclado.nextInt();

		System.out.print("Ingrese tercer valor: ");
		valor3 = teclado.nextInt();

		System.out.print("Ingrese cuarto valor: ");
		valor4 = teclado.nextInt();

		suma = valor1 + valor2;
		producto = valor3 * valor4;

		System.out.print("Suma de los dos primeros valores :");
		System.out.println(suma);

		System.out.print("El producto del tercer y cuarto valor es :");
		System.out.println(producto);

	}
}
