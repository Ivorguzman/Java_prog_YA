package proyecto19_1;

import java.util.Scanner;

public class Mayor_3_numeros {

	public static void main(String[] args) {
		/*
		 * Se cargan por teclado tres números distintos.
		 * Mostrar por pantalla el mayor de ellos
		 * NO SE DEBE UTILIZAR EL OPERRADOR AND (&&).
		 */

		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;

		System.out.print("Ingrese Primer numero :");
		num1 = teclado.nextInt();

		System.out.print("Ingrese el segundo numero :");
		num2 = teclado.nextInt();


		System.out.print("Ingrese el tercer numero :");
		num3 = teclado.nextInt();

		if (num1 > num2){

			if (num1 > num3){
				System.out.println(num1 + " Es el numero mayor");
			} else{
				System.out.println(num3 + " Es el numero mayor");
			}
		} else{
			if (num2 > num3){
				System.out.println(num2 + " Es el numero Mayor");
			} else{
				System.out.println(num3 + " Es el numero Mayor");
			}
		}
	}


}















