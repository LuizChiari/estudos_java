package curso_programacao;

import java.util.Scanner;

 import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int x, y;
			
			x = sc.nextInt();
		    y = sc.nextInt();

			System.out.println("Os Dados Digitados Foram: ");
			System.out.println(x);
			System.out.println(y);
			System.out.println("A soma de X + Y é "+(x+y));
			
			sc.close();
			
		}
	}
