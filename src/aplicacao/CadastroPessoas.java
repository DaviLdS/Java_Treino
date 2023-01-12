package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class CadastroPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos pessoas serao informadas ? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		int menos16 = 0;
		double menos16p = 0;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "° pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			if (idade[i] < 16) {
				menos16++;
			}
		}
		double somaAlt = 0;
		double mediaAlt = 0;
		for (int i = 0; i < altura.length; i++) {
			somaAlt += +altura[i];
		}
		mediaAlt = somaAlt / altura.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n",mediaAlt);
		menos16p = (100 * menos16) / idade.length;
		System.out.println("Pessoas com menos de 16 anos: " + menos16p + "%");
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
