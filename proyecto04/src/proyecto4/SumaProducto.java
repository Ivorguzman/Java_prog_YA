package proyecto4;

import java.util.Scanner;

/*Problema:
Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.*/

public class SumaProducto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma, producto;

		System.out.print("Ingrese el primer valor :");
		num1 = teclado.nextInt();

		System.out.print("Ingrese sugundo valor :");
		num2 = teclado.nextInt();

		suma = num1 + num2;
		producto = num1 * num2;

		System.out.print("La suma de los dos valores es: ");
		System.out.println(suma);

		System.out.print("El producto de los dos valores es: ");
		System.out.print(producto);

	}

}
