package projetoCaneta;

public class Teste {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		c1.tampada = false;
		c1.status();
		c1.rabiscar();
		
		System.out.println();
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "Faber-Castell";
		c2.cor = "Preta";
		//c2.ponta = 1.0f;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		System.out.println();

		Caneta c3 = new Caneta();
		
		c3.modelo = "Intec";
		c3.cor = "Vermelho";
		//c3.ponta = 1.5f;
		c3.tampar();
		c3.status();
		c3.rabiscar();
	}

}
