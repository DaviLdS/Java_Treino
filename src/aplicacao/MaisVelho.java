package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar ? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome = new String[n];
		int[] idade = new int[n];
		String velho = "inicializei";
		int ind = 0;
		for(int i = 0 ; i < n; i++) {
			System.out.println("Dados da "+ (i + 1) + "° pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			if(ind < idade[i]) {
				ind = idade[i];
				velho = nome[i];
			}	
		}
		System.out.println("Pessoa mais velha: "+ velho);
		sc.close();
	}

}
