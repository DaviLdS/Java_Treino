import java.util.Scanner;

public class Exercicio2 {
	/************* Questão 1 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva um numero:");
//		int n = sc.nextInt();
//		if(n>-1) {
//			System.out.println("NAO NEGATIVO");
//		}
//		else {
//			System.out.println(" NEGATIVO");
//		}	
//sc.close();}
	/************* Questão 2 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva um numero:");
//		int n = sc.nextInt();
//		if(n % 2 == 0) {
//			System.out.println("PAR");
//		}else {
//			System.out.println("IMPAR");
//	sc.close();	}
//	}
	/************* Questão 3 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva dois numeros:");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		if(n<m) {
//			if(m % n == 0){
//			System.out.println("São Multiplos");
//			}
//			else {
//				System.out.println("Não São Multiplos");
//			}
//		}
//		else if(n % m == 0){
//				System.out.println("São Multiplos");
//				}
//		else {
//		System.out.println("Não São Multiplos");
//			 }
//	sc.close();}
	/************* Questão 4 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva duas horas:");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int o;
//		if(n<m) {
//			o=m-n;
//		}
//		else {
//			o=24-n+m;
//			 }
//		System.out.println("O JOGO DUROU " + o + " HORA(S)");
//sc.close();}
	/************* Questão 5 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva o codigo e a quantidade:");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		double o;
//		if (n == 1) {
//			o = 4.00 * m;
//		} else if (n == 2) {
//			o = m * 4.5;
//		} else if (n == 3) {
//			o = m * 5.0;
//		} else if (n == 4) {
//			o = m * 2.0;
//		} else {
//			o = m * 1.5;
//		}
//		System.out.printf("Total: R$ %.2f%n", o);
//		sc.close();
//	}
	/************* Questão 6 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva um numero:");
//		double n = sc.nextDouble();
//		if (n > 0 && n <= 25) {
//			System.out.println("Está no intervalo (0,25]");
//		} else if (n > 26 && n <= 50) {
//			System.out.println("Está no intervalo (25,50]");
//		} else if (n > 50 && n <= 75) {
//			System.out.println("Está no intervalo (50,75]");
//		} else if (n > 75 && n <= 100) {
//			System.out.println("Está no intervalo (75,100]");
//		} else {
//			System.out.println("Fora de intervalo");
//		}
//		sc.close();
//	}
	/************* Questão 7 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escreva as coordenadas x e y:");
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		if (x > 0 && y > 0) {
//			System.out.println("Está no Quadrante 'Q1';");
//		} else if (x < 0 && y > 0) {
//			System.out.println("Está no Quadrante 'Q2';");
//		} else if (x < 0 && y < 0) {
//			System.out.println("Está no Quadrante 'Q3';");
//		} else if (x > 0 && y < 0) {
//			System.out.println("Está no Quadrante 'Q4';");
//		} else if (x == 0 && y == 0) {
//			System.out.println("Origem");
//		}
//		sc.close();
//	}
	/************* Questão 8 ***************/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu Salario?");
		double v = sc.nextDouble();
		double x;
		double y;
		if (v <= 2000.00) {
			System.out.println("Isento");
		} else if (v > 2000.00 && v < 3000.00) {
			x = v - 2000;
			y = (0.08) * x;
			System.out.printf("Imposto de renda:R$ %.2f%n",y);
		} else if (v > 3000.00 && v < 4500.00) {
			x = v - 3000;
			y = (0.08*1000)+(0.18*x);
			System.out.printf("Imposto de renda:R$ %.2f%n",y);
		} else if (v > 4500.00) {
			x = v - 4500.00;
			y = (0.08*1000.00)+(0.18*1500.00)+(0.28*x);
			System.out.printf("Imposto de renda:R$ %.2f%n",y);
		} 
		sc.close();
	}
}
