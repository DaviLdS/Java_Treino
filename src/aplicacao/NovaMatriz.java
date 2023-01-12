package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class NovaMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal Principal: ");
		for(int i = 0; i<n; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		System.out.println();
		System.out.println("Numeros negativos: ");
		int negativo = 0;
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n;j++) {
				if(mat[i][j]<0) {
					negativo++;
				}
			}
		}
		System.out.println(negativo);
		sc.close();
	}

}
