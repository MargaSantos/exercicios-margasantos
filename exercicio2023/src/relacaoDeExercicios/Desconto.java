package relacaoDeExercicios;

import java.util.Scanner;

public class Desconto {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome produto: ");
		String produto = input.nextLine();
		
		System.out.print("Informe o valor do produto: R$ ");
		double preco = input.nextDouble();
		
		double percentual = 5.0/100;
		double valorFinal = preco - (percentual*preco);
		
		System.out.print("Este produto está com valor promocional: " + valorFinal);
		
		System.exit(0);
		
		
		
		
		input.close();
	}
	

}
