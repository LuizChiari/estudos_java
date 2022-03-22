import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Número:");
		int num1 = sc.nextInt();
		System.out.println();

		System.out.println("Digite um Número");
		int num2 = sc.nextInt();
		System.out.println();

		sc.close();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Mltiplos");
		}

	}

}
