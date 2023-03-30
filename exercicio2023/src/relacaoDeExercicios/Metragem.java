package relacaoDeExercicios;

import java.util.Scanner;

public class Metragem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a largura da parede: ");
		double width = input.nextDouble(); //width = largura
		
		System.out.println("Digite a altura da parede: ");
		double height = input.nextDouble(); //height = altura
		
		Math.pow(width, height);
		
		System.out.println("O metro quadrado da parede é " + Math.pow(width, height) );
		System.out.println("Você precisará de: " +  Math.pow(width, height)/2 + " litros tinta para pintar a parede.");
		
		input.close();

	}

}
