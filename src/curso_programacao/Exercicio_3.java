package curso_programacao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		int A,B,C,D, Diferenca;
		
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		
	    Diferenca = (A*B-C*D);
		
		System.out.println(" Dados digitados:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		System.out.println("Diferenca entre (A * B - C * D)= "+Diferenca);
		sc.close();
	}
}
