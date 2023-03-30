package relacaoDeExercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionário(a): ");
		String funcionario = entrada.nextLine();
		
		System.out.println("Informa o salário do funcionário(a): ");
		double salario = entrada.nextDouble();
		
		System.out.println("Nome do funcionário(a): " + funcionario);
		System.out.println("Salário: " + salario);
		System.out.println("O funcionário(a) " + funcionario + " tem o salário de " + salario + " em Junho.");
		
		entrada.close();

	}

}
