package proyecto19_2;

import java.util.Scanner;

public class TipoValor {

	public static void main(String[] args) {
		/*
		 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo,
		 * nulo o negativo.
		 */
		
		try (Scanner teclado = new Scanner(System.in);){

			System.out.print("Ingrese Primer numero :");

			Double num1 = teclado.nextDouble();
			
			if (num1 == Math.floor(num1)){

				if (num1 > 0){
					System.out.print("El numero es un positivo");
				} else{
					if (num1 < 0){
						System.out.print("El numero es negativo");
					} else{

						System.out.print("El numero es neutro");
					}

				}


			} else{
				System.out.println(Math.floor(num1));
				System.out.print(num1 + " Es decimal y el valor debe se  Entero");
			}



		} catch(Exception ex){

			ex.printStackTrace();

		}

		


	}
}











