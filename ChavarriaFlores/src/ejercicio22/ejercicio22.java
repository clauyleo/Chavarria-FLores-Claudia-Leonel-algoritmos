 package ejercicio22;

import java.util.Scanner;

  public class ejercicio22{
  public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

  String Nombre, Apellido;
  
  int numero_ganador;

  System.out.println("ingresa su nombre: ");
  Nombre = entrada.next();
  System.out.println("ingresa su apellido: ");
  Apellido = entrada.next();

  double numero = (Math.random()*10);

  int resultado = (int) numero;

  System.out.println("Nombre y apellido: "+Apellido +", " +Nombre);
  

  System.out.println("Ingresar un numero: ");
  numero_ganador= entrada.nextInt();
  

  while ( numero_ganador != resultado) {
		System.out.println("No, le erraste.");
		System.out.println("Vuelva a intentarlo: ");
		numero_ganador= entrada.nextInt();
	}

  
  System.out.println("ganaste ");
  
}
}