package relacaoDeExercicios;

import java.util.Scanner;

public class Quilometro {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a distãncia em metros: ");
		double distance = input.nextDouble();
		
		System.out.println("A distância de " + distance + "m" + " corresponde a:");
		System.out.println(distance * 0.001 + "Km");
		System.out.println(distance / 100 + "Hm");
		System.out.println(distance / 10 + "Dam");//Math.floor serve para arrendar um número
		System.out.println(Math.floor(distance) / 0.1 + "dm"); 
		System.out.println(distance / 0.01 + "cm");
		System.out.println(distance / 0.001 + "mm");
		
		input.close();

	}

}
