
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		double x = sc.nextDouble();

		sc.close();

		if (x < 0) {
			System.out.println("Negativo ");
		} else {
			System.out.println("Positivo ");
		}

	}
}
