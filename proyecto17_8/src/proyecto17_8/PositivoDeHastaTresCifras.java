package proyecto17_8;

import java.util.Scanner;

/**
 * @author Alexander
 * 
 * Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras
 *  y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
 *  Mostrar un mensaje de error si el número de cifras es mayor.
 *
 */
public class PositivoDeHastaTresCifras {

	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);

		double num;

		System.out.print("Introdusca un numero :");
		num = teclado.nextDouble();

		if (num > 0 && num < 10) {
			System.out.println("Este nunero es de 1 cifra :" + num);
		} else {
			if (num > 0 && num < 100) {
				System.out.println("Este nunero es de 2 cifras :" + num);
			} else {
				if (num > 0 && num < 1000) {
					System.out.println("Este nunero es de 3 cifras :" + num);
				} else {
					System.out.println("ERROR: El numero tiene que ser positivo y maximo 3 cifras :" + num);
				}
			}
		}
	}
}
			
