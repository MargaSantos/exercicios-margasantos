package relacaoDeExercicios;

import java.util.Scanner;

public class DobroNum {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double number = input.nextDouble();
		
		System.out.println("O dobro de " + number + " é " + (number * 2));
		System.out.println("A terça parte de " + number + " é " + (number / 3));
		
		
		input.close();

	}

}
