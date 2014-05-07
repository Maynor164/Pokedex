import java.util.Scanner;
public class gihubito {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un numero 1: ");
		int num1 = s.nextInt();
		
		/*Siento que el operador confunde*/
			System.out.print("Ingrese un operador(+,-,/,*): ");
			char oper = s.next().charAt(0);
			System.out.print("Ingrese un numero 2: ");
			int num2 = s.nextInt();
		switch (oper)
		{
		case '+':
			System.out.println("Resultado de suma:"+(num1+num2));
			break;
		case '-':
			System.out.println("Resultado de resta:"+(num1-num2));
			break;
		case '/':
			System.out.println("Resultado de division:"+(num1/num2));
			break;
		case '*':
			System.out.println("Resultado de multiplicación:"+(num1*num2));
			break;
			default:
				System.out.print("Operador desconocido");
			
		}	
	}

}
