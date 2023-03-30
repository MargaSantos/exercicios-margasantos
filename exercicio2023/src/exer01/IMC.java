package exer01;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o seu peso: ");
		String weight = input.nextLine(); 
		
		double testeDouble = 0.0;
		
		if (!caracterVazio(weight)) {
			if (caracterLetras(weight)) {
				testeDouble = stringDouble(weight);
				System.out.println(testeDouble);
				// if(stringDouble(weight)) {
				// System.out.println("Foi transformado em double");
				// } else {
				// System.out.println("Não transformou em double");
				// }
				System.out.println("Peso registrado com sucesso");
			} else {
				System.out.println("Tente novamente um caracter válido");
			} // System.out.println("Digite um caracter válido");
		} else {
			System.out.println("Caractere vazio ");
		}
		
		System.out.println();
		
		System.out.println("Digite a sua altura em centímetros: ");
		String height = input.next(); 
		
		double stringAlturaDouble = 0.0;
		
		if (!caracterVazio(height)) {
			if (caracterLetras(height)) {
				stringAlturaDouble = (stringAlturaDouble(height))/100;
				System.out.println(stringAlturaDouble);
				
				System.out.println("Altura registrado com sucesso");
			} else {
				System.out.println("Tente novamente um caracter válido");
			}
		} else {
			System.out.println("Caractere vazio ");
		}

		double imc = testeDouble/(stringAlturaDouble*stringAlturaDouble);
		
		System.out.println();

		System.out.printf("SEU IMC: %.2f",  imc);
		System.out.println();
		
		input.close();
		
		System.out.println();
		
		if(imc < 18.5) {
			System.out.println("Classificação: MAGREZA");
		} else if(imc >= 18.6 && imc <= 24.9 ) {
			System.out.println("Classificação: NORMAL");
		} else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("Classificação: SOBREPESO");
		} else if(imc >= 30.0 && imc <= 39.9) {
			System.out.println("Classificação: OBESIDADE");
		} else {
			System.out.println("Classificação: OBESIDADE GRAVE");
		}
		
		System.out.println();
		System.out.println("Veja interpretação do IMC:");
		System.out.println("IMC                    CLASSIFICAÇÃO          OBESIDADE (GRAU)");
		System.out.println("MENOR QUE 18,5         MAGREZA                         0");
		System.out.println("ENTRE 18,5 E 24,9      NORMAL                          0");
		System.out.println("ENTRE 25,0 E 29,9      SOBREPESO                       I");
		System.out.println("ENTRE 30,0 E 39,9      OBESIDADE                       II");
		System.out.println("MAIOR QUE 40,0         OBESIDADE GRAVE                 III");
	}
  	
	public static boolean caracterVazio(String caracter) {
		return caracter.isBlank();

	}

	public static boolean caracterLetras(String letras) {
		for (int i = 0; i < letras.length(); i++) {
			if (!Character.isDigit(letras.charAt(i)))
				return false;
		}
		return true;
	}

	
	public static double stringDouble(String transformationStringDouble) {
		double caracter = 0.0;
		try {
			caracter = Double.parseDouble(transformationStringDouble);
		} catch (Exception e) {
			System.out.println(e);
		}

		return caracter;
	}
	public static double stringAlturaDouble(String transformationStringAlturaDouble) {
		double caracter = 0.0;
		try {
			caracter = Double.parseDouble(transformationStringAlturaDouble);
		} catch (Exception e) {
			System.out.println(e);
		}

		return caracter;
	}
}
