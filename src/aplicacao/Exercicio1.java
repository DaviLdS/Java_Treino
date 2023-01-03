package aplicação;

import java.util.Scanner;

import entidades.Empregado;
import entidades.Retangulo;
import utils.BoletimAluno;

public class Exercicio1 {

	public static void main(String[] args) {
//		retangulo();
//		empregado();
		notaAluno();

	}

	public static void retangulo() {
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		System.out.println("Entre com a altura e o comprimento do rentâgulo:");
		ret.l1 = sc.nextDouble();
		ret.l2 = sc.nextDouble();
		System.out.printf("AREA = %.2f%nPERIMETRO = %.2f%nDIAGONAL = %.2f%n", ret.area(), ret.perimetro(),
				ret.diagonal());
		sc.close();
	}

	public static void empregado() {
		double porcentagem;
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		System.out.print("Digite o nome do empregado:");
		emp.nome = sc.nextLine();
		System.out.print("Digite o salario bruto do empregado:");
		emp.SalarioBruto = sc.nextDouble();
		System.out.print("Digite o Imposto que deve ser cobrado:");
		emp.TaxaDeImposto = sc.nextDouble();
		System.out.println();
		System.out.printf("Empregado:%s, R$ %.2f%n%n", emp.nome, emp.SalarioLiquido());
		System.out.print("Em quantos porcentos se deve aumentar o salario?");
		porcentagem = sc.nextDouble();
		emp.AumentoDeSalario(porcentagem);
		System.out.println();
		System.out.printf("Salario atualizado do %s será: R$ %.2f", emp.nome, emp.SalarioAtualizado);
		sc.close();
	}

	public static void notaAluno() {
		Scanner sc = new Scanner(System.in);
		BoletimAluno bol = new BoletimAluno();
		System.out.print("Digite o nome do Aluno:");
		bol.aluno = sc.nextLine();
		System.out.println("Digite as 3 notas:");
		bol.nota1 = sc.nextDouble();
		bol.nota2 = sc.nextDouble();
		bol.nota3 = sc.nextDouble();
		System.out.println("Nota final = " + bol.notaFinal());
		System.out.printf(bol.resultado(),bol.pontosf);
		sc.close();
	}
}