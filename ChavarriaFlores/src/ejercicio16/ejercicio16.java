package ejercicio16;

	import java.util.Scanner;

	public class ejercicio16{
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
		
			int hora, minuto, segundo; 
			
			System.out.println("Ingresa hora: ");
			hora = entrada.nextInt();
			
			System.out.println("Ingresa minutos: ");
			minuto = entrada.nextInt();
			
			
			System.out.println("Ingresa segundos: ");
			segundo = entrada.nextInt();

			
			if (hora<=24 && minuto<=60 && segundo<=60) {
				
			System.out.println("el numero que ingreso es correcto ");
			
}
			else {
			System.out.println("el numero que ingreso es incorrecto ");
			
			}
			
				
                			
			
		}		
}
		
