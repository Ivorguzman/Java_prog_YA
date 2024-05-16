package proyecto13_7;

import java.util.Scanner;

/**
 *Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
 * mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos,
 un número entero)
 *
 */
public class PositivoDeUno_o_DosDgitos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.print("Ingresa un  numero  del 0 al 99 :");
		numero = teclado.nextInt();

		if (numero >= 0 && numero <= 99) {
			if (numero >= 0 && numero <= 9) {
				System.out.print("El numero es de un solo Digito");
			} else {
				System.out.print("El numero es de dos Digito");
			}

		} else {

			System.out.print("El numero no puede menor a  0  ni  mayor a 99");

		}


	}

}
