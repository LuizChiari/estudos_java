package curso_programacao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de a:");
		int a = sc.nextInt();
		System.out.println();
		System.out.println("Digite o valor de b:");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Digite o valor de c");
		int c = sc.nextInt();
		System.out.println("Digite o valor de d:");
		int d = sc.nextInt();
		System.out.println();
		int diferenca = (a*b-c*d);
		System.out.println("Diferenca entre (a*b-c*d)= "+diferenca);
		sc.close();
	}
}