package repaso2;

import java.util.Scanner;

public class repaso2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] apellido = { "Flores", "Chavarria", "Romero"};
		
		
		int[] edad = new int[3];

		edad[0] = 37;
		edad[1] = 28;
		edad[2] = 50;

		int[] dni = new int[3];

		dni[0] = 47570200;
		dni[1] = 47494823;
		dni[2] = 47123456;
		
		
		String[] marca = { "Chevrolet", "Peugeot","Renault"};

		String[] modelo = {"Corsa", "208"," Sandero"};

		int[] anio = new int[3];

		anio[0] = 2021;
		anio[1] = 2022;
		anio[2] = 2008;
	
		
		String[] patente= {"AD178JK", "AD200RS", "AD202VW"};

		
		for (int i = 0; i < anio.length; i++) {
		if(anio[i] >=2020 && edad[i]>25) {
			System.out.println("el auto "+ marca[i]+" modelo "+modelo[i]+" del "+ anio[i]
					+" patente "+patente[i]+" pertenece a " + apellido[i]+" que tiene de dni " + dni[i]);
		}
		}
	}
}