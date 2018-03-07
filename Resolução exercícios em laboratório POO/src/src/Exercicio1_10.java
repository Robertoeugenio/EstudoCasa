import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario [] funcs = new Funcionario[3];
		Funcionario um = new Funcionario();
		Funcionario dois = new Funcionario();
		Funcionario tres = new Funcionario();
		
		funcs[0] = um;
		funcs[1] = dois;
		funcs[2] = tres;
		
		// teste
		for(int i=0; i<3;i++) {
			System.out.println("Digite o nome: ");
			funcs[i].nome = sc.next();
			System.out.println("Digite o quantidade de horas: ");
			funcs[i].horas = sc.nextDouble();
			System.out.println("Digite o valor das horas: ");
			funcs[i].ValorHora = sc.nextDouble();
		}
		for(int i=0; i<3;i++) {
			System.out.println("O salário do " + funcs[i] + " é: " + funcs[i].calculaSalario());
		}

	}
}

