/*Vamos a tomar el ejercicio 47, pero con algunas modificaciones:
• Declará los array globales como “static”. Lo mismo hace con las
variables globales.
• Creá una función para que el usuario coloque una cantidad de
notas (que obviamente, será igual a la cantidad de apellidos). Te
sugiero que la variable que uses para cargar la cantidad de notas,
sea una variable global.
• Armá una función para pedirle a un usuario que ingrese las notas
de un alumno. Retorná el array de números de esa función.
• Generá otra función para almacenar los apellidos de cada alumno.
Pensá que la cantidad de apellidos, tiene que ser la misma que la
cantidad de notas. Retorná el array de apellidos.
• Finalmente, mostrá en pantalla el array de apellidos, y el de notas.
Sugerencia para esto: acordate de almacenar la función con el
array, dentro de un nuevo array en la función principal.
Una vez logrado lo anterior, hay que hacer una pequeña corrección.
Mientras el usuario ingrese una nota menor a 0, o mayor a 10, hay que
indicarle que se equivocó, y que vuelva a ingresar la calificación.*/

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

