import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora de inicio:");
		int hora = sc.nextInt();
		System.out.println();

		System.out.println("Digite a hora de Final:");
		int hora2 = sc.nextInt();
		System.out.println();

		sc.close();

		int totalHoras;

		if (hora < hora2) {
			totalHoras = hora2 - hora;
		} else {
			totalHoras = 24 - hora + hora2;
		}
		System.out.println("O Jogo Durou " + totalHoras + " Hora(s)");
	}

}