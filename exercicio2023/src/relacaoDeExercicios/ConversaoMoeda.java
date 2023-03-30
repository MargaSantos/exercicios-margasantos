package relacaoDeExercicios;

import java.util.Scanner;

public class ConversaoMoeda {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor que está na sua carteira: ");
		double money = input.nextDouble();
		
		System.out.println("Você tem R$" + money + " você pode comprar " + (money * 3.45) + " dólares.");
		
		input.close();

	}

}
