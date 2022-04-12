import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Cachorro Quente   R$ 4.00   cod. 1");
		System.out.println("X-Salada          R$ 4.50   cod. 2");
		System.out.println("X-Bacon           R$ 5.00   cod. 3");
		System.out.println("Torrada Simples   R$ 2.00   cod. 4");
		System.out.println("Refrigerante      R$ 1.50   cod. 5");
		System.out.println();
		System.out.println("Digite o Código do Produto");
		int codigo = sc.nextInt();
		System.out.println();
		System.out.println("Digite a quantidade");
		int quantidade = sc.nextInt();
		System.out.println();

		double total;
		if (codigo == 1) {

			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}
}