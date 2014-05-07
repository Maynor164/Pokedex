import java.util.Scanner;
public class Edad {

	public static void main(String[] args) {
	System.out.print("Ingrese su edad: ");
	Scanner Scanner = new Scanner(System.in);
	int edad; 
	edad= Scanner. nextInt();
	  
	if (edad<=18)
	
		System.out.println("Menor de edad");
		
	else if (edad<=30)	
		System.out.println("Joven");
	
	else if (edad<=50)
		System.out.println("Adulto");
	
	else if (edad>50)
		System.out.println("Anciano"); 
	
	}

}
