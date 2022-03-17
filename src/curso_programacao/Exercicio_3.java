package curso_programacao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		int a,b,c,d, diferenca;
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		
	    	diferenca = (a*b-c*d);
		
		System.out.println(" Dados digitados:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		System.out.println("D = "+d);
		System.out.println("Diferenca entre (A * B - C * D)= "+diferenca);
		sc.close();
	}
}
