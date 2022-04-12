
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Didite um número inteiro:");
		int n = sc.nextInt();

		sc.close();

		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
