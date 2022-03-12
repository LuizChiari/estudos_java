import java.util.Locale;

public class Srting {


	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23567;
		
		
		
		System.out.println("Products:"+ " "+product1+" the  "+product2);
		System.out.println("Computer, which price is $ "+price1);
		System.out.println("Record: "+age +" years old, code "+code +" and gender "+gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		System.out.println("Uma linha a mais ao git");
		
		//Products:
		//Computer, which price is $ 2100,00
		//Office desk, which price is $ 650,50
		//Record: 30 years old, code 5290 and gender: F
		//Measue With eight decimal places: 53,23456700
		//Rouded (three decimal palces): 53,235
		//US decimal point: 53.235
		
		
		
		
		
		
		
		
		

	}

}
