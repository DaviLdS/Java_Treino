import java.util.Scanner;

public class Exercicio4 {
	/************* Questão 1 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y=sc.nextInt(); 
//		for(int x = 1;x<=y;x++) {
//			if(x%2!=0){
//				System.out.println(x);
//			}
//		}
//		sc.close();
//	}
	/************* Questão 2 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x,in=0,out=0;
//		for(int n=sc.nextInt();n!=0;n--) {
//			x = sc.nextInt();
//			if(x<=20 && x>=10){
//				in=in+1;
//			}else {
//				out=out+1;
//			}
//		}
//		System.out.printf("%d in%n%d out%n",in,out);
//		sc.close();
//	}	
	/************* Questão 3 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x,in=0,out=0;
//		for(int n=sc.nextInt();n!=0;n--) {
//			x = sc.nextInt();
//			if(x<=20 && x>=10){
//				in=in+1;
//			}else {
//				out=out+1;
//			}
//		}
//		System.out.printf("%d in%n%d out%n",in,out);
//		sc.close();
//	}	
	/************* Questão 4 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double x,div,div2;
//		for(int n=sc.nextInt();n!=0;n--) {
//			div = sc.nextInt();
//			div2 = sc.nextInt();
//			x = div/div2;
//			if(div2 == 0) {
//				System.out.println("divisão impossivel");
//			}
//			else {
//				System.out.printf("%.1f%n", x);
//			}
//		}
//		sc.close();
//	}	
	/************* Questão 5 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int fat = 1;
//		for(int i=1;i<=n;i++) {
//			fat=fat*i;
//		}
//		System.out.println(fat);	
//		sc.close();
//	}	
	/************* Questão 6 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//			System.out.println(i);	
//			}
//		}	
//		sc.close();
//	}	
	/************* Questão 7 ***************/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int quadrado = 0;
		int cubo = 0;
		for(int i=1;i<=n;i++) {
			quadrado = i*i;
			cubo = i*i*i;
			System.out.printf("%d %d %d%n",i,quadrado,cubo);
			
		}	
		sc.close();
	}	
}