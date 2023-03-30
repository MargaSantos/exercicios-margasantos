package relacaoDeExercicios;

import java.util.Scanner;

public class AumentoSalarial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		double horasTrab = input.nextDouble();
		
		System.out.print("Informe o valor que recebe por horas trabalhadas: ");
		double valorTrab = input.nextDouble();
		
		System.out.print("Informe quantos dias por mês você trabalha: ");
		int diasTrab = input.nextInt();
		
		double salario = (horasTrab*valorTrab)*diasTrab;
		
		double percentual = 15.0/100;
		double novoSalario = salario + (percentual*salario);
		
		System.out.print("Seu salário atual é: " + salario);
				System.out.println();
		System.out.print("Atualização salarial por promoção: " + novoSalario);
		
		
		
		input.close();
		
	}
}
