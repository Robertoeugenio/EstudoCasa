import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma String: ");
		String palavra = entrada.nextLine();
		palavra.toLowerCase();
		System.out.println("Palavra alterada: " + palavra.toLowerCase());

		sc.close();
	}

}