package ejercicio21;
	
	import java.util.Scanner;

	public class ejercicio21 {

		public static void main(String[] args) throws InterruptedException{
			Scanner entrada = new Scanner (System.in);
			
			int temperatura = 35;
			
			while (temperatura <= 100) {
				System.out.println("Temperatura: "+temperatura);
				
				Thread.sleep(20);
				
			if( temperatura==85 ) {
				System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");
				Thread.sleep(1000);
			}
		
			
			else if(temperatura==99) {
				
				System.out.println("VALOR EXTREMO. APAGANDO PC.");

			}
			temperatura+=2;
		}
			
			
			
			
			
		}
	}
