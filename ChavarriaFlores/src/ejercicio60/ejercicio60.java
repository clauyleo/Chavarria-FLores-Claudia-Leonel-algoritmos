/*Vamos a tomar el ejercicio 47, pero con algunas modificaciones:
� Declar� los array globales como �static�. Lo mismo hace con las
variables globales.
� Cre� una funci�n para que el usuario coloque una cantidad de
notas (que obviamente, ser� igual a la cantidad de apellidos). Te
sugiero que la variable que uses para cargar la cantidad de notas,
sea una variable global.
� Arm� una funci�n para pedirle a un usuario que ingrese las notas
de un alumno. Retorn� el array de n�meros de esa funci�n.
� Gener� otra funci�n para almacenar los apellidos de cada alumno.
Pens� que la cantidad de apellidos, tiene que ser la misma que la
cantidad de notas. Retorn� el array de apellidos.
� Finalmente, mostr� en pantalla el array de apellidos, y el de notas.
Sugerencia para esto: acordate de almacenar la funci�n con el
array, dentro de un nuevo array en la funci�n principal.
Una vez logrado lo anterior, hay que hacer una peque�a correcci�n.
Mientras el usuario ingrese una nota menor a 0, o mayor a 10, hay que
indicarle que se equivoc�, y que vuelva a ingresar la calificaci�n.*/

package ejercicio60;

	import java.util.Scanner;
	
	public class ejercicio60 {
		
		static int Notas;
		static String Apellido;
		  
		static int[] numerodenotas;
		
		public static void ingresarNumeros() {
		    Scanner entrada = new Scanner(System.in);
		    
		    System.out.println("Ingresa  la cantidad de notas : ");
		    Notas =  entrada.nextInt();
		    
		    for (int l = 0; l < Notas; l++) {
		    	
		    	System.out.print("Ingrese el apellido del alumno: ");
				Apellido= entrada.nextLine();

				System.out.print("Ingrese la nota del alumno: ");
			Notas= entrada.nextInt();
			
			}
		    
		}
		
		public static void main (String[] args) {
			ingresarNumeros();
		}
		
		
}

