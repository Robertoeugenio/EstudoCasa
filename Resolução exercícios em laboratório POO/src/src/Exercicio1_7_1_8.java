import java.util.Locale;
import java.util.Scanner;


public class Exercicio1_7_1_8 {

	public static void main(String[] args) {
		Raio circ1 = new Raio();
		Raio circ2 = new Raio();
		Raio circ3 = new Raio();
		
		circ1.raio = 3;
		circ2.raio = 4;
		circ3.raio = 7;
		
				
		System.out.printf("O circulo 1 possui\n area = %.2f\n Perimetro : %.2f\n"  ,circ1.calculaArea() , circ1.calculaCircunferencia());
		System.out.printf("\nO circulo 2 possui\n area = %.2f\n Perimetro : %.2f\n" , circ2.calculaArea() ,circ2.calculaCircunferencia());
		System.out.printf("\nO circulo 3 possui\n area = %.2f\n Perimetro : %.2f\n" , circ3.calculaArea() ,circ3.calculaCircunferencia());

	}

}

