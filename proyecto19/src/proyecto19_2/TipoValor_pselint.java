/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TIPOVALOR.java."

import java.io.*;
import java.math.*;

public class tipovalor {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String entero;
		String ingresa;
		double num1;
		String numero;
		String un;
		System.out.println(ingresa+un+numero+entero);
		num1 = bufEntrada.readLine();
		if (num1==Math.floor(num1)) {
			if (num1>0) {
				System.out.println("EL NUMERO  INTRODUCIDO ES POSITIVO");
			} else {
				if (num1<0) {
					System.out.println("EL NUMERO ES NEGATIVO");
				} else {
					if (num1==0) {
						System.out.println("EL NUMERO ES NEUTRO");
					}
				}
			}
			// si el número es positivo, nulo o negativo.
			// Se ingresa por teclado un valor entero, mostrar una leyenda que indique
		} else {
			System.out.println("El numero debe ser entero");
		}
	}


}

