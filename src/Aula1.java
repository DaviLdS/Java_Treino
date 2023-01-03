import java.util.Locale;

public class Aula1 {

	public static void main(String[] args) {

		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int code = 5290;
		char gender = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		System.out.printf("Products:%n%s, which prime is $ %.2f%n"
				+ "%s, which price is $ %.2f%n%nRecord:%d years old,"
				+ " code %d and gender: %c%n%nMeasue with eight"
				+ " decimal places: %.6f%nRouded (three decimal places):" 
				,produto1,preco1,produto2
				,preco2,idade,code,gender,medida);
		Locale.setDefault(Locale.US);
		System.out.printf(" %.3f",medida);
	
		
		
	}
}
