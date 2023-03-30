package relacaoDeExercicios;

import java.util.Scanner;

public class SucessorAntecessor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		int number = input.nextInt();
		
		System.out.println("O antecessor de: " + number + " é " + (number - 1) + ".");
		System.out.println("O sucessor de: " + number + " é " + (number + 1) + ".");
		
		System.out.println();
		
		
		input.close();

	}

}
