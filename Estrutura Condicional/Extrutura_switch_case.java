import java.util.Scanner;

public class Extrutura_switch_case {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Dia Da Semana De 1 a 7");

		int x = sc.nextInt();
		String dia;

		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda-feira";
		} else if (x == 3) {
			dia = "Terça-feira";
		} else if (x == 4) {
			dia = "Quarta-feira";
		} else if (x == 5) {
			dia = "Quinta-feira";
		} else if (x == 6) {
			dia = "Sexta-feira";
		} else if (x == 7) {
			dia = "Sabado";
		} else {
			dia = "Valor Inválido";
		}
		System.out.println("Dia da Semana: " + dia);
		sc.close();

	}
} // Outro jeito de fazer no Exemplo Estrutura Switch Case Atualizada