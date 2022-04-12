import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor do seu Salário");
		System.out.println();

		double salario = sc.nextDouble();

		sc.close();

		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;

		} else if (salario <= 3000.0) {
			System.out.println("Voçê pagará de Imposto");
			imposto = (salario - 2000.0) * 0.08;

		} else if (salario <= 4500.0) {
			System.out.println("Voçê pagará de Imposto");
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			System.out.println("Voçê pagará de Imposto");
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Voçê é Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

	}
}