package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cafe;

		System.out.println("Indica que tipo de cafe queres:");
		cafe = datos.nextInt();

		switch (cafe) {

		case 1:
			System.out.println("cafe cortado");
			break;

		case 2:
			System.out.println("cafe latte");
			break;

		case 3:
			System.out.println("cafe solo");
			break;

		case 4:
			System.out.println("cafe lagrima");
			break;

		case 5:

			break;

		default:
			System.out.println("seleccionaste la opcion incorrecta ");
			break;
		}
	}
}