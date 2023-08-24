package ejercicio53;

import java.util.Scanner;

public class ejercicio53 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean flag=false;
		String[][] matriz = new String[2][2];
		String apellido;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.print("ingrese un apellido en la posicion: " + i + " " + j + "\n");
				matriz[i][j] = entrada.next();
				
			
			}
		}

		System.out.println("ingrese un apellido a encontrar: ");
		apellido = entrada.next();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j].equalsIgnoreCase(apellido)) {
		
					flag=true;
					break;
		
			}
				
			}
			
			}
		
		if(flag == true) {
			System.out.println("se encontro");
		}
			
			
		else if(flag == false)	{
			System.out.println("no se encontro");
		}
		}
}
