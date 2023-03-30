package exer01;

import java.util.Objects;
import java.util.Scanner;


public class logica {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número válida: ");
		String value = input.nextLine();
		
		if(validacao(value) && !value.isBlank()) {
			if(valueNumberInt(value)) {
				System.out.println("O número passado é par!");
			} else{
				System.out.println("O número passado é ímpar!");
			}
		} else{
			System.out.println("Não é uma opção válida");
		} 
			
			
		input.close();

	}
	
	public static boolean validacao(String number) {
		for(int i = 0; i < number.length(); i++) {
			if(!Character.isDigit(number.charAt(i))) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean valueNumberInt(String transformationNumber) {
		Integer number = Integer.parseInt(transformationNumber);
		return number %2 == 0;
	}
	
}


