package proyecto12_7;

import java.util.Scanner;

/**
 * Se ingresan tres notas de un alumno, si el promedio es mayor
 *  o igual a siete mostrar un mensaje "Promocionado".
 *  si una nota es mayor a 7 indicar  el error
 */
public class PromedioEsMayor_o_Igual {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double sumatoria;
		double promedio;

		double promocionado = 6;

		System.out.print("Ingrese Valor de la nota 1 :");
		nota1 = teclado.nextDouble();

		System.out.print("Ingrese Valor de la nota 2 :");
		nota2 = teclado.nextDouble();

		System.out.print("Ingrese Valor de la nota 3 :");
		nota3 = teclado.nextDouble();

		sumatoria = nota1 + nota2 + nota3;
		promedio = sumatoria / 3;
		
		
		if (nota1 > 7 || nota2 > 7 || nota3 > 7) {

			System.out.println("ERROR: las notas no puden ser mayor a 7");

		} else {
			if (promedio >= promocionado) {
				System.out.println("Exelente Estas promocionado para la beca");
			} else {
				System.out.println("Estudia más no estas promocionado para la beca");

			}

		}



	}

}
