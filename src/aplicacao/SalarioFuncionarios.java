package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class SalarioFuncionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos funcionarios serão registrados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Funcionario> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Matricula: ");
			int matricula = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			Funcionario fun = new Funcionario(matricula, name, salario);
			list.add(fun);
		}
		System.out.print("Entre com a matricula do funcionario que terá aumento de salario?");
		int matricula = sc.nextInt();
		sc.nextLine();
		Integer pos = posMatricula(list,matricula);
			if(pos == null) {
				System.out.println("Essa Matricula não existe!");
			}else {
		System.out.print("Entre com a porcentagem de aumento");
		double porcentagem = sc.nextDouble();
		sc.nextLine();
		list.get(pos).aumentoSalario(porcentagem);
		}
			System.out.println();
			System.out.println("Lista de Funcionarios");
			for(Funcionario fun : list) {
				System.out.println(fun);
		sc.close();
	}
	}

	public static Integer posMatricula(List<Funcionario> list, int matricula) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMatricula() == matricula) {
				return i;
			}
		}
		return null;
	}
}
 
