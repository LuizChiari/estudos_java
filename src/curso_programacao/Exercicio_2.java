package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
        
		Double R, A, π =  3.14159;
		
		R = sc.nextDouble();
		
		A = (R * R)* π;
	
		System.out.printf("A=%.4f%n", A);
		
		
		sc.close();
	}
}
