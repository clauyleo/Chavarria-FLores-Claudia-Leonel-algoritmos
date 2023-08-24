package ejercicio51;

import java.util.Scanner;

public class ejercicio51 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[][] matriz = new float[2][3];
		
		
		   matriz[0][0] = 1.33f;
	        matriz[0][1] = 2.44f;
	        matriz[0][2] = 3.33f;
	        matriz[1][0] = 4.88f;
	        matriz[1][1] = 5.02f;
	        matriz[1][2] = 6.12f;
	    
	        for (int i = 0; i < matriz.length; i++) { //posicion de las matrices
	            for (int j = 0; j < matriz[i].length; j++) { // 
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
}
}
