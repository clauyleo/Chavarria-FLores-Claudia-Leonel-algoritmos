package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.println("Qu� calificaci�n tendr�s en el a�o en la asignatura: ");
		
		double numRandom = (Math.random()*10);
		int numAleatorio = (int) numRandom;
		
		System.out.println("nota final: "+numAleatorio);
		
		
		
	}
}
