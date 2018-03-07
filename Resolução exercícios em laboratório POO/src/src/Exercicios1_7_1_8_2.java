import java.util.Locale;
import java.util.Scanner;


public class Exercicios1_7_1_8_2 {

	public static void main(String[] args) {
		Raio circ1 = new Raio();
		Raio circ2 = new Raio();
		Raio circ3 = new Raio();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor para o primeiro circulo ");
		
		circ1.raio = in.nextDouble();
		
		System.out.println("Digite o valor para o segundo circulo ");
		circ2.raio = in.nextDouble();

		System.out.println("Digite o valor para o terceiro circulo ");
		circ3.raio = in.nextDouble();
		
				
		System.out.printf("O circulo 1 possui\n area = %.2f\n Perimetro : %.2f\n"  ,circ1.calculaArea() , circ1.calculaCircunferencia());
		System.out.printf("\nO circulo 2 possui\n area = %.2f\n Perimetro : %.2f\n" , circ2.calculaArea() ,circ2.calculaCircunferencia());
		System.out.printf("\nO circulo 3 possui\n area = %.2f\n Perimetro : %.2f\n" , circ3.calculaArea() ,circ3.calculaCircunferencia());

	}

}

