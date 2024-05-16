package proyecto18_8;

import java.util.Scanner;

/**
 * @author Tutoriales Ya:
 
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de
preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un
programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas
correctas que ha obtenido, y sabiendo que:

Nivel máximo:
Porcentaje>=90%.

Nivel medio:
Porcentaje>=75% y <90%.

Nivel regular:
Porcentaje>=50% y <75%.

Fuera de nivel: Porcentaje<50%
 *
 */

public class TestDeCapacitacion {

	public static void main(String[] arg) {
		
		Scanner teclado = new Scanner(System.in);

		int total_preguntas;
		int preguntas_correctas;
		int porcentaje;

		System.out.print("Introduscas total de preguntas realizadas : ");
		total_preguntas = teclado.nextInt();

		System.out.print("Indique el total de las preguntas correctas");
		preguntas_correctas = teclado.nextInt();

		porcentaje = preguntas_correctas * 100 / total_preguntas;

		if (porcentaje >= 90) {
			System.out.print("Porcentaje solicitudes Nivel máximo: " + porcentaje + "%");
		} else {

			if (porcentaje >= 75 && porcentaje < 90) {
				System.out.println("Porcentaje solicitudes Nivel medio: "  + porcentaje + "%");

			} else {
					if (porcentaje >= 50 && porcentaje < 75) {

						System.out.println("Porcentaje solicitudes Nivel regular: "  + porcentaje + "%");

					} else {

						System.out.println("Porcentaje solicitudes Fuera de nivel: " + porcentaje + "%");
					}
			}
		}
	}

}

