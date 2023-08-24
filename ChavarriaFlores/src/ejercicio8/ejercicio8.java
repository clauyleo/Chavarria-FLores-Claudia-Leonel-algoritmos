package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float numero;

		
		System.out.println("Ingrese un numero entero y dos decimales ");
		numero = entrada.nextFloat();
		
		double base = numero, exponente = 2;
		int   valor = (int)Math.pow(base, exponente);
		
		System.out.println("numero elevado es: "+valor);
		
		double numRandom = (Math.random());
		float numAleatorio = (float) numRandom;
		
		System.out.println("numero random: "+(valor+numAleatorio));
		
		float valor2= valor * 7;
		System.out.println("numero multiplicado por 7 es: "+valor2);
		
		float raiz_cuadrada = (float) Math.sqrt(valor2);
		System.out.println("Tu resultado es:"+raiz_cuadrada);
		
		
    }
}
