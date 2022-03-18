package curso_programacao;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double x = sc.nextDouble();
		System.out.println();
		System.out.println("Digite outro numero: ");
		double y = sc.nextDouble();
		System.out.println();
		double soma = (x + y);

		System.out.println("A soma dos numeros é "+soma);

		sc.close();
	}
}
