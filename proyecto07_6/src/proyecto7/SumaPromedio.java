package proyecto7;

import java.util.Scanner;

public class SumaPromedio {
	/**
	 *Realizar un programa que lea cuatro valores
	 *numéricos e informar su suma y promedio
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valor1, valor2, valor3, valor4, sumatoria, promedio;

		System.out.print("Introdusca primer valor :");
		valor1 = teclado.nextInt();

		System.out.print("Introdusca segundo valor :");
		valor2 = teclado.nextInt();

		System.out.print("Itrodusca tercer valor :");
		valor3 = teclado.nextInt();

		System.out.print("Introdusca cuarto valor :");
		valor4 = teclado.nextInt();

		sumatoria = valor1 + valor2 + valor3 + valor4;

		promedio = sumatoria / 4;

		System.out.print("La sumatoria de los valores introducidos es :");
		System.out.println(sumatoria);

		System.out.print("El promedio de la sumatoria es :");
		System.out.print(promedio);

	}

}


