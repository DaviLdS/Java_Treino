import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	/******* Questão 1 *******/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x,z,soma;
//		x = sc.nextInt();
//		sc.nextLine();
//		z= sc.nextInt();
//		soma = x + z;
//		System.out.println("Soma = "+soma);
//		sc.close();	}
	/******* Questão 2 *******/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int raio;
//		double pi = 3.14159;
//		double area;
//		raio = sc.nextInt();
//		area = (double) pi * Math.pow(raio, 2); 
//		Locale.setDefault(Locale.US);
//		System.out.printf("Raio do Circulo = %.4f",area);
//		sc.close();	}
	/******* Questão 3 *******/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int diferenca,a,b,c,d;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		diferenca = a*b-c*d;
//		System.out.printf("Diferença dos produtos = %d",diferenca);
//		sc.close();	}
	/******* Questão 4 *******/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
//		int number, hours;
//		float salary, hourprice;
//		number = sc.nextInt();
//		hours = sc.nextInt();
//		hourprice = sc.nextFloat();
//		salary =(float) hours * hourprice;
//		System.out.printf("Salário do funcionario numero: %d é %.2f", number,salary);
//		sc.close();}
	/******* Questão 4 *******/
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			Locale.setDefault(Locale.US);
//			int peca1,peca2,quantidade1,quantidade2;
//			float preco1,preco2,precototal;
//			peca1 = sc.nextInt();
//			quantidade1 = sc.nextInt();
//			preco1 = sc.nextFloat();
//			peca2 = sc.nextInt();
//			quantidade2 = sc.nextInt();
//			preco2 = sc.nextFloat();
//			precototal =(float) (quantidade1*preco1)+(quantidade2*preco2);
//			System.out.printf("Valor total a pagar é %.2f", precototal);	
//			sc.close();}
	/******* Questão 4 *******/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		pi = 3.14159;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo =(float) (a * c) / 2;
		circulo =(float) pi * Math.pow(c, 2);
		trapezio =(float) (a + b) * c / 2;
		quadrado =(float) Math.pow(b, 2);
		retangulo =(float) a * b;
		System.out.printf("A área do Triângulo é %.3f%n"
						+ "A área do Círculo é %.3f%n"
						+ "A área do Trapézio é %.3f%n"
						+ "A área do Quadrado é %.3f%n"
						+ "A área do Retângulo é %.3f", triangulo,circulo,trapezio,quadrado,retangulo);
		sc.close();}

}
