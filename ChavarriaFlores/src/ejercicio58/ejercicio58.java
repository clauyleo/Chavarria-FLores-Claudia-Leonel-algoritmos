/*Desafío 58)
Se le solicita a un usuario que ingrese un número (puede ser entero o flotante).
 Armar una función para el ingreso de ese número. 
 Luego, armar otra función que devuelva “true” si el número es positivo,
 o “false” si es negativo.
 Mostrar en pantalla el resultado de la función.
*/

package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {

static float n1;



	public static float ingresarnumero (float a) {
		boolean numero = false;
	    if(a<0) {
	    	numero=false;
	    	 System.out.println("FALSE");
	}
	    if(a>0) {
	    numero = true;
	    System.out.println("TRUE");
	}
	
	return a;

	}
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    ingresarnumero (n1);
	    System.out.println("El valor es: " + n1)  
	}
	
}

