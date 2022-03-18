package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);



		System.out.println("Qual é o RA:");
		int ra = sc.nextInt();
		System.out.println();
		System.out.println("Informe o valor a ser pago pela hora:");
		double s = sc.nextDouble();
		System.out.println();
		System.out.println("Informe as horas trabalhadas:");
		int h = sc.nextInt();
		System.out.println();
		double salario = (h*s);

		System.out.println("RA: "+ra);
		System.out.printf("Voçê recebeu R$ %.2f%n",+salario);

		sc.close();
	}

}


