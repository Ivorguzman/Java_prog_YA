import java.util.Scanner;

public class SueldoOperario {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int horasTrabajadas;
		float costoHora;
		float sueldo;
		System.out.print("Ingrese la cantidad de horas trabajadas :");
		horasTrabajadas = entradaTeclado.nextInt();
		System.out.print("Valor de la hora :");
		costoHora = entradaTeclado.nextFloat();
		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar :");
		System.out.print(sueldo);
	}

}

