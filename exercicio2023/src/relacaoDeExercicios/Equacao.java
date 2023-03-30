package relacaoDeExercicios;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		double a = input.nextDouble();
		
		System.out.print("Informe o valor de B: ");
		double b = input.nextDouble();
		
		System.out.print("Informe o valor de C: ");
		double c = input.nextDouble();
		
		double delta = b*b - 4*a*c;
		
		double x1 = (b + Math.sqrt(delta))/(2*a);
		
		double x2 = (b - Math.sqrt(delta))/(2*a);
		
		System.out.println("O valor de DELTA é: " + delta);
	
		
		
		input.close();

	}

}
