import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		 

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite duas String: ");
		String palavra1 = entrada.next();
		String palavra2 = entrada.next();

		if(palavra1.equals(palavra2)) {
			System.out.println("nomes iguais");
		}else 
			System.out.println("nomes diferentes");
		
		sc.close();
	}

}