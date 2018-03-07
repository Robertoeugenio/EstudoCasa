package lista_27_02_2018.exe4;

public class MainConta {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Conta minhaConta1 = new Conta();
			Conta minhaConta2 = new Conta("Eloah Maria Pucci");
			
			//porque sem o construtor ele te obriga
			// a usar objeto, já com o construtor ele 
			// deixa voce ter a opçao do obejto 
			
			
			
			
			System.out.println("Responsavel da  conta 1 e da conta 2 : " + minhaConta1.getNome() + minhaConta2.getNome());

		}

	}