import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Paciente paciente = new Paciente();

		paciente.peso = sc.nextDouble();
		paciente.altura = sc.nextDouble();
		double resposta = paciente.calculaIMC(paciente.peso, paciente.altura);
		System.out.printf("valor do imc é : %.2f\n", resposta);

	}

}

class Paciente {
	String nome;
	double peso;
	double altura;

	public double calculaIMC(double peso, double altura) {

		return peso / (altura * altura);
	}

}
