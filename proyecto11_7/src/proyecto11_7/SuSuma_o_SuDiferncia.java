package proyecto11_7;

import java.util.Scanner;

/**
 * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo
 * informar su suma y diferencia, en caso contrario informar el producto y la división
 * del primero respecto al segundo.
 */
public class SuSuma_o_SuDiferncia {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float num1;
		float num2;
		float diferencia;
		float producto;

		System.out.print("Ingrese el primer numero : ");
		num1 = teclado.nextFloat();

		System.out.print("Ingrese el segundo numero : ");
		num2 = teclado.nextFloat();

		if (num1 > num2) {
			System.out.println("El primer numero es mayor que el segundo numero : ");
			diferencia = num1 - num2;
			System.out.println("Diferencia del  primer numero menos el segundo numero es : ");
			System.out.print(diferencia);
		}else {
			System.out.println("El primer numero es menor que el segundo numero : ");
			producto = num1 * num2;
			System.out.println("Producto del  primer numero por  el segundo numero es : ");
			System.out.print(producto);
				
		}

	}

}
