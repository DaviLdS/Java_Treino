package aplicação;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double menor = 999999999, maior = 0, media = 0;
		int homens = 0, mulheres = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "° pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "° pessoa(M/F): ");
			genero[i] = (char) System.in.read();
			if (maior < altura[i]) {
				maior = altura[i];
			}
			if (menor > altura[i]) {
				menor = altura[i];
			}
			if (genero[i] == 'F') {
				media = media + altura[i];
				mulheres++;
			}
			if (genero[i] == 'M') {
				homens++;
			}
		}
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n" ,(media/mulheres));
		System.out.println("Numero de homens = " + homens);
		sc.close();
	}

}
