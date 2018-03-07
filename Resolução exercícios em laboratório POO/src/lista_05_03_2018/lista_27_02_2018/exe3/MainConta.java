package lista_27_02_2018.exe3;



public class MainConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.setNome("SuperHomem");
		minhaConta.setSaldo(1978.00);
		minhaConta.setSalario(25.00);
		
		 System.out.println(minhaConta.getNome() + minhaConta.getSaldo() + minhaConta.getSalario());



	}

}
