package aplicação;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculos;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DolarReal();
	}
	public static void DolarReal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do Dolar?");
		double precoDolar = sc.nextDouble();
		System.out.print("Quantos dolares você vai comprar?");
		double dolar = sc.nextDouble();
		double real = Calculos.conversor(precoDolar,dolar);
		System.out.printf("Você terar que pagar em reais: R$ %.2f",real);
		sc.close();
	}

}
