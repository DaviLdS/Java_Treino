package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosição {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		double ind = 0;
		double maior = 0;
		int posicao = 0;
		System.out.printf("%nMaior Valor = ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] > ind) {
				ind = vetor[i];
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.printf("%.1f%n", maior);
		System.out.printf("Posição do maior valor = %d%n", posicao);
		sc.close();
	}

}
