/*Desaf�o 58)
Se le solicita a un usuario que ingrese un n�mero (puede ser entero o flotante).
 Armar una funci�n para el ingreso de ese n�mero. 
 Luego, armar otra funci�n que devuelva �true� si el n�mero es positivo,
 o �false� si es negativo.
 Mostrar en pantalla el resultado de la funci�n.
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

