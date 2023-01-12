package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class PensaoDaVelha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos vão ser alugados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] quarto = new int[10];
		for (int i = 0; i < 10; i++) {
			quarto[i] = 11;
		}
		String[] nome = new String[10];
		String[] email = new String[10];
		int[] tempquarto = new int[n];
		String[] tempnome = new String[n];
		String[] tempemail = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");
			System.out.print("Nome: ");
			tempnome[i] = sc.nextLine();
			System.out.print("Email: ");
			tempemail[i] = sc.nextLine();
			System.out.print("Quarto: ");
			tempquarto[i] = sc.nextInt();
			sc.nextLine();
			System.out.println();
			int num = tempquarto[i];
			quarto[num] = tempquarto[i];
			nome[num] = tempnome[i];
			email[num] = tempemail[i];
		}
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (quarto[i] != 11) {
				System.out.printf("%d: %s, %s%n", i, nome[i], email[i]);
			}
		}
		sc.close();
	}
}
