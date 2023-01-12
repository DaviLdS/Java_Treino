package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class NovaMatriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de Linhas: ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o numero de Colunas: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[][] mat = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.nextLine();
		System.out.print("Diga o numero que você quer encontrar:");
		int x = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição do X " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Numero a Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Numero Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Numero a Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Numero Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
