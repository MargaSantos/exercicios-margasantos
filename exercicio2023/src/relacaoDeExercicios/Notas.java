package relacaoDeExercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nota 1:");
		double note1 = input.nextDouble();
		
		System.out.println("Note 2: ");
		double note2 = input.nextDouble();
		
		System.out.println("A média entre " + note1 + " e " + note2 + " é igual a " + (note1 + note2)/2 + ".");
		
		input.close();
		

	}

}
