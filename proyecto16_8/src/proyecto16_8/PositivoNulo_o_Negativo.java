package proyecto16_8;

import java.util.Scanner;

public class PositivoNulo_o_Negativo {

	/**
	 * Se ingresa por teclado un valor entero, mostrar
	 * una leyenda que indique si el número es positivo, nulo o negativo.
	 */
	public static void main(String[] args) {

		double num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introdusca un numero :");
		num = teclado.nextDouble();

		if (num > 0) {
			System.out.println("Este es un numero positivo ==> : " + num);
		} else {
			if (num < 0) {
				System.out.println("Este es un numero negativo ==> : " + num);
			}
			if (num == 0) {
				System.out.println("Este es un numero igual a [0] erroneamente llamado nulo ==> : " + num);

			}
		}
		
	}

}
