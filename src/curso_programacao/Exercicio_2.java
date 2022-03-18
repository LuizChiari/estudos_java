package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o Raio do circulo:");
		System.out.println();

		double r = sc.nextDouble();
		
		sc.close();
		
		double pi = 3.14159;
		double a = (r * r * pi);
		
		System.out.println("O valor da área do circulo é:");
		System.out.printf("%.4f%n", a);

	}
}
