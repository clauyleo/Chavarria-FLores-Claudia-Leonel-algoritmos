package ejercicio12;
	
	import java.util.Scanner;

    public class ejercicio12{
	  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int calificacion;
    System.out.println("ingresa tu calificacion entre 1 y 10: ");
	  calificacion = entrada.nextInt();
	  
	  if (calificacion<1|| calificacion>10) {
			System.out.println("numero invalido");
}
	  
	  else if(calificacion>=1 && calificacion<=3) {
			System.out.println("su calificacion es insuficiente");
		}
		
	  else if(calificacion>3 && calificacion<6) {
		  System.out.println("su calificacion es no logrado");
	  }
	  
	  else if(calificacion>=6 && calificacion<=7) {
		  System.out.println("su calificacion es suficiente");
	  }
	  
	  else if(calificacion>=8 &&  calificacion<=9) {
		  System.out.println("su calificacion es notable");
	  }
	  
	  else if(calificacion==10){
			System.out.println("su calificacion es sobresaliente ");  
		}

    
	  }
}
