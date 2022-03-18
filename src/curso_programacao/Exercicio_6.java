package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o valor de a:");
		double a = sc.nextDouble();
		System.out.println();

		System.out.println("Digite o valor de b:");
		double b = sc.nextDouble();
		System.out.println();

		System.out.println("Digite o valor de c");
		double c = sc.nextDouble();

		sc.close();

		double atr = a * c;
		System.out.printf("Área do trianguro retângulo %.3f%n", atr);

		double pi = 3.14159;
		double circulo = (c * c * pi);
		System.out.printf("Área do circulo %.3f%n", circulo);

		double x = ((a + b) * c) / 2;
		System.out.printf("Área do trapezio %.3f%n", x);

		double y = (b * b) / 2;
		System.out.printf("Área do quadrado %.3f%n", y);

		double z = a * b;
		System.out.printf("Área do retângulo %.3f%n", z);

		// para indentar a pagina toda ctrl+shift+f
	}

}
