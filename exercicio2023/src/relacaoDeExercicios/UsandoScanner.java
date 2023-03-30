package relacaoDeExercicios;

import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = entrada.next();
		
		System.out.println("Olá " + nome + ", é um prazer te conhecer!");
		
		entrada.close();
	}

}
