package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
        
		Double r, a, π =  3.14159;
		
		r = sc.nextDouble();
		
		a = (r * r)* π;
	
		System.out.printf("A=%.4f%n", a);
		
		
		sc.close();
	}
}
