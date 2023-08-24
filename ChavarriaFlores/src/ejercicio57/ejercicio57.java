/*Escriba un programa en Java que devuelva la parte fraccionaria
de cualquier número introducido por el usuario. Por ejemplo, si se
introduce el número 256.879, debería desplegarse el número 0.879. Para
ello, pensá en lo siguiente: almacená un valor en una variable flotante.
Ahora, ese mismo valor, guardalo en otra variable entera. Finalmente, a
la variable flotante quitale el valor entero.*/


package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {
	
	static float n1;
	static float n2;
	
	public static float numero() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un primer numero: ");
	    n1 =  entrada.nextFloat();
	    
	    
	    int numero = (int) n1;
	    n2 = (n1 - numero);
	    return numero;
}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    numero();
	    System.out.println("El valor decimal es: " + n2);
	    
	}
	
} 