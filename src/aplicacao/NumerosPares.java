package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Numeros Pares:");
		int ind = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				ind++;
			}
		}
		System.out.printf("%nQuantidade de Pares = %d%n", ind);
		sc.close();
	}
}
