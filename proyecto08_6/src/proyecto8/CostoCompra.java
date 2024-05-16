package proyecto8;

import java.util.Scanner;

/**
 * @author Alexander
 * Se debe desarrollar un programa que pida el ingreso del precio
 *  de un artículo y la cantidad que lleva el cliente.
 *  Mostrar lo que debe abonar el comprador.
 */
public class CostoCompra {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int cantidad;
		float precio, totalPagar;

		System.out.print("Cantidad de articulas a pagar :");
		cantidad = teclado.nextInt();

		System.out.print("Precio del articulo :");
		precio = teclado.nextFloat();

		// totalPagar = cantidad * precio;

		System.out.print("Total a pagar:" + cantidad * precio + " $"); // Sin usar variable totalPagar

	}

}
