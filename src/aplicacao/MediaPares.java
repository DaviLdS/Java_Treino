package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double media = 0;
		int ind = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				media = media + vetor[i];
				ind++;
			}
		}
		media = media / ind;
		if (media > 0) {
			System.out.printf("Media dos Pares = %.1f", media);
		} else {
			System.out.print("Nenhum numero Par");
		}
		sc.close();

	}
}
