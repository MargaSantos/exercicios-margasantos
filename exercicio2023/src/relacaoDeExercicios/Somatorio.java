package relacaoDeExercicios;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Digite um valor: ");
			int valor1 = input.nextInt();
			
			System.out.println("Digite outro valor: ");
			int valor2 = input.nextInt();
			
			int soma = valor1 + valor2;
			
			System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual a " + soma + ".");
		
		input.close();
	}

}
