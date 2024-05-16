package proyecto14_8;

import java.util.Scanner;

/**
 * @author Alexander
 * Problema:
Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos
mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado"
 *
 */
public class Calcule_el_promedio {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;

		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese la primer nota : ");
		nota1 = teclado.nextDouble();

		System.out.print("Ingrese la segunda nota :");
		nota2 = teclado.nextDouble();

		System.out.print("Ingrese la tercer nota :");
		nota3 = teclado.nextDouble();
		
		
		double promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println("Su promedio es :" + promedio);
		
		if(promedio>=7) {
			System.out.println("Felicitaciones estas Promocionado");
		} else {
			if (promedio >= 4 && promedio < 7) {
				System.out.println("Tienes un promedio Regular debes estudiar más");
			} else {
				if (promedio < 4) {
					System.out.println("Fuistes Reprobado");
				}
			}

		}

	};

}
