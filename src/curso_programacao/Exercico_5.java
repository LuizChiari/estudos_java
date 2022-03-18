package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercico_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o código do item:");
		int item1 = sc.nextInt();
		System.out.println();

		System.out.println("Digite a quantidade de itens:");
		int item2 = sc.nextInt();
		System.out.println();

		System.out.println("Digite o valor de cada item:");
		double valor = sc.nextDouble();
		System.out.println();

		sc.close();

		double total = item2 * valor;
		System.out.printf("Total R$ %.2f%n ", total);

	}

}