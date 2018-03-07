import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa casa = new Casa();
		
		System.out.printf("Digite o nome do proprietário: ");
		casa.proprietario.nome = sc.nextLine();
		System.out.printf("Digite o nome da rua: ");
		casa.endereco.logradouro = sc.nextLine();
		System.out.printf("Digite o número: ");
		casa.endereco.numero = sc.nextLine();
		System.out.printf("Digite  a cidade: ");
		casa.endereco.cidade = sc.nextLine();
		System.out.printf("Digite o estado: ");
		casa.endereco.estado = sc.nextLine();
		System.out.printf("Digite o CEP: ");
		casa.endereco.cep = sc.nextLine();
		
		System.out.printf("\n");
	
		System.out.printf("Nome",casa.proprietario.nome);

		System.out.printf("Logradouro",casa.endereco.logradouro);
		System.out.printf("Número",casa.endereco.numero);
		System.out.printf("Cidade",casa.endereco.cidade);
		System.out.printf("Estado",casa.endereco.estado);
		System.out.printf("CEP",casa.endereco.cep);
		
		sc.close();
	}
}

class Pessoa {
	String nome;
}

class Endereco {
	String logradouro;
	String numero;
	String cidade;
	String estado;
	String cep;
}

class Casa {
	Pessoa proprietario = new Pessoa();
	Endereco endereco = new Endereco();
}