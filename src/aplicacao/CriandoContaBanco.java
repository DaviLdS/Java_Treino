package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBanco;

public class CriandoContaBanco {
	public static void main(String[] args) {
		ContaBanco conta;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Informe o nome do usuario da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer deposito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBanco(numero, nome, depositoInicial);
		} else {
			conta = new ContaBanco(numero, nome);
		}
		System.out.println();
		System.out.println("Informações da Conta:");
		System.out.printf("Conta %d, Nome:%s, Saldo: R$ %.2f", conta.getNumConta(), conta.getNomeTitular(),
				conta.getSaldo());
		System.out.println();
		System.out.println();
		System.out.print("Informe o valor do deposito:");
		conta.deposito(sc.nextDouble());
		System.out.println("Informações atualizadas da Conta:");
		System.out.printf("Conta %d, Nome:%s, Saldo: R$ %.2f", conta.getNumConta(), conta.getNomeTitular(),
				conta.getSaldo());
		System.out.println();
		System.out.println();
		System.out.print("Informe o valor de retirada:");
		conta.retirada(sc.nextDouble());
		System.out.println("Informações atualizadas da Conta:");
		System.out.printf("Conta %d, Nome:%s, Saldo: R$ %.2f", conta.getNumConta(), conta.getNomeTitular(),
				conta.getSaldo());
		sc.close();
	}
}
