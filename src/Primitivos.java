import java.util.Scanner;
public class Primitivos {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Ficha Criminal");
		System.out.println("Ingrese su nombre: ");
		String nombre= S.next();
		System.out.println("Ingrese su edad: ");
		int edad= S.nextInt();
		System.out.println("A=Asecinato,B=Robos de varitas,C=Pociones ilegales: ");
		System.out.println("Clase de crimen(A,B,C): ");
		char sexo= S.next().charAt(0);
		System.out.println("Es primera ves en Azkaban(true/false)?");
		boolean soltero= S.nextBoolean();
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(sexo);
		System.out.println(soltero);
		System.out.println("Bienvenido a Azkaban");
	}

}
