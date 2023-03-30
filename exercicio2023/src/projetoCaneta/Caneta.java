package projetoCaneta;

public class Caneta {

		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		protected boolean tampada;
		
		void status() {
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Uma caneta de cor: " + this.cor);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Carga " + this.carga);
			System.out.println("A caneta está tampada? " + this.tampada);
		}
		public void rabiscar() {
			if(this.tampada == true) {
				System.err.println("ERRO! Não posso rabiscar!");
			} else {
				System.out.println("Estou rabiscando");
			}
		}

		protected void tampar() {
			this.tampada = true;

		}

		void destampar() {
			this.tampada = false;
		}

	}

