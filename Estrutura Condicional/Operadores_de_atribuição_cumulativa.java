import java.util.Scanner;

public class Operadores_de_atribuição_cumulativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os minutos gasto ao telefone");

		int minutos = sc.nextInt();

		sc.close();

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;

			// conta = conta + (minutos - 100) * 2.0;
			// Usando o += é a mesma coisa de (conta = conta +)
		}

		System.out.printf("Valor da Conta = R$ %.2f%n", conta);

	}

}
