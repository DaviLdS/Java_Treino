package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double media = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			media = media + vetor[i];
		}
		media = media / n;
		System.out.printf("Media do Vetor = %.3f%n", media);
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
			sc.close();
		}
	}
}
