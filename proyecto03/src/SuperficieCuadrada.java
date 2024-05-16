import java.util.Scanner;

public class SuperficieCuadrada {
	public static void main(String[] args) {

		Scanner porTeclado = new Scanner(System.in);

		int lado;
		System.out.print("Ingrese la valor del lado del cuadrado :");
		lado = porTeclado.nextInt();

		int superficie;
		superficie = lado * lado;

		System.out.print("La superficie del cuadrado es : ");
		System.out.println(superficie);

	}

}
