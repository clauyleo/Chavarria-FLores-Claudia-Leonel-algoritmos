package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.println("Qué calificación tendrás en el año en la asignatura: ");
		
		double numRandom = (Math.random()*10);
		int numAleatorio = (int) numRandom;
		
		System.out.println("nota final: "+numAleatorio);
		
		
		
	}
}
