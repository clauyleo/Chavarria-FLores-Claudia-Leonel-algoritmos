package ingresardatos;

import java.util.Scanner;
public class ingresardatos {
public static void main(String args[]) {
	Scanner entrada = new Scanner (System.in);
	
	String nombre1;
	String nombre2;
	
	int edad1;
	int edad2;
	
	System.out.println("ingresar primer nombre");
	nombre1=entrada.next();
	
	System.out.println("ingresar su edad");
	edad1=entrada.nextInt();
	
	System.out.println("ingresar segundo nombre");
	nombre2=entrada.next();
	
	System.out.println("ingresar su edad");
	edad2=entrada.nextInt();
	
	System.out.println("el primer nombre es: "+nombre1);
	System.out.println("el segundo nombre : "+nombre2);
	
	System.out.println("la primera edad es: "+edad1);
	System.out.println("la segunda edad es: "+edad2);
	
}
}
