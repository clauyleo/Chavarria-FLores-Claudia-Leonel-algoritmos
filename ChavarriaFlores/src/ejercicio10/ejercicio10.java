 package ejercicio10;

import java.util.Scanner;

  public class ejercicio10{
  public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

  String Nombre, Apellido;
  
  int numero2;

  System.out.println("ingresa su nombre: ");
  Nombre = entrada.next();
  System.out.println("ingresa su apellido: ");
  Apellido = entrada.next();

  double numero = (Math.random()*99);

  int resultado = (int) numero;

  System.out.println("Nombre y apellido: "+Apellido +", " +Nombre);
  

  System.out.println("Ingresar un numero: ");
 
  
  numero2 = entrada.nextInt();

  if (numero2==resultado ) {
	System.out.println("ganaste");			
  }
  else {
    System.out.println("perdiste");	
  }
  System.out.println("Su numero de Bingo es: "+resultado);


}
}