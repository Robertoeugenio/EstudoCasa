import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		funcionario1.nome = "Joao";
		funcionario2.nome = "Mateus";
		funcionario3.nome = "Lucas";
		
		funcionario1.horas = 20.0;
		funcionario2.horas = 40.0;
		funcionario3.horas = 40.0;
		
		funcionario1.ValorHora = 3.5;
		funcionario2.ValorHora = 5.5;
		funcionario3.ValorHora = 13.5;

		
		
		System.out.printf("salario do funcionario1 é : %.2f\n", funcionario1.calculaSalario());
		System.out.printf("salario do funcionario1 é : %.2f\n", funcionario2.calculaSalario());
		System.out.printf("salario do funcionario1 é : %.2f\n", funcionario3.calculaSalario());
		}
	}


