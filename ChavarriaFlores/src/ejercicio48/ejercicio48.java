package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] apellidos = {"Martinez", "Miglio", "Rojas", "Romero"};
		String apellidoMax = "";
		String apellidoMin = "{";
	
		for(int i=0; i < apellidos.length;i++) {
			if(apellidos[i].compareTo(apellidoMax)>0) {
				apellidoMax = apellidos[i];
		}
		
			if(apellidos[i].compareTo(apellidoMin)<0) {
				apellidoMin = apellidos[i];
		}
		
		}
		
		System.out.print("Ultimo : apellido"+ apellidoMax);
		System.out.print("\nPrimer apellido: " + apellidoMin);
		
		}
}