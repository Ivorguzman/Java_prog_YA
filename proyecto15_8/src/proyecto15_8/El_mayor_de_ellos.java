package proyecto15_8;

import java.util.Scanner;

/**
 * @author Alexander
 * 
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 *
 */
public class El_mayor_de_ellos {
	public static void main(String[] args) {

		double num1;
		double num2;
		double num3;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el primer numero : ");
		num1 = teclado.nextDouble();

		System.out.print("Ingrese el segundo numero : ");
		num2 = teclado.nextDouble();

		System.out.print("Ingrese el tercer numero : ");
		num3 = teclado.nextDouble();

		if (num1>num2) {
			if (num1 > num3) {
				System.out.print("Este es el numeros mayor :" + num1);
			} else {
				System.out.print("Este es el numeros mayor :" + num3);
				}


				} else {
					if (num2 > num3) {
						System.out.print("Este es el numeros mayor :" + num2);
				} else {
					System.out.print("Este es el numeros mayor :" + num3);
				}
			}
		}
	}

