package proyecto5;

import java.util.Scanner;

public class LadoDeUnCuadrado {
	public static void main(String[] args) {
		/*Realizar la carga del lado de un cuadrado,
		mostrar por pantalla el perímetro del
		mismo (El perímetro de un cuadrado se calcula
		 multiplicando el valor del lado por cuatro)
		*/

		Scanner teclado = new Scanner(System.in);

		int ladoCuadrado;
		int perimetro;

		System.out.print("Ingrese el valor del lado del cuadrado : ");
		ladoCuadrado = teclado.nextInt();

		perimetro = ladoCuadrado * 4;

		System.out.print("El perimetro de cuadrado es :");
		System.out.print(perimetro);

	}
}

