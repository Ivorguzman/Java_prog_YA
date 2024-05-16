package proyecto10_7;

import java.util.Scanner;

public class NumeroMayor {
	/**
	 * Problema:
	Realizar un programa que solicite ingresar dos números distintos
	y muestre por pantalla el mayor de ellos.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float num1;
		float num2;

		System.out.print("Ingrese el primer numero :");
		num1 = teclado.nextFloat();

		System.out.print("Ingrese segundo numero :");
		num2 = teclado.nextFloat();

		if (num1 > num2) {
			System.out.print("El primer numero es mayor que el segundo numero");
		} else {
			System.out.print("El segundo numero es mayor que el primer numero ");
		}

	}
}
