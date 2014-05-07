import java.util.Scanner;
public class califica {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un Nota 1: ");
		double not1 = s.nextDouble();
		
		System.out.print("Ingrese un Nota 2: ");
		double not2 = s.nextDouble();
		
		System.out.print("Ingrese un Nota 3: ");
		double not3 = s.nextDouble();
		
		double prome= prome=(not1+not2+not3)/3;
		System.out.println("Promedio: "+ prome);

	}

}
