package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class PensaoDaVelhaOrientado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluguel[] vetor = new Aluguel[10];
		System.out.print("Quantos quartos vão ser alugados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Aluguel #" + (i) + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			vetor[quarto] = new Aluguel(name, email);
		}
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ":" + vetor[i]);
			}
			sc.close();
		}
	}
}
