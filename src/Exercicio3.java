import java.util.Scanner;

public class Exercicio3 {
	/************* Questão 1 ***************/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite a senha:");
//		int n = 0;
//		while (n != 2002) {
//			n = sc.nextInt();
//			System.out.println("Senha Invalida");
//		}
//		System.out.println("Acesso Permitido");
//		sc.close();
//	}
	/************* Questão 2 ***************/
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Escreva as coordenadas x e y:");
//	int x = 1,y = 1;
//	while(x!= 0 && y != 0){
//	 x = sc.nextInt();
//	 y = sc.nextInt();
//	if (x > 0 && y > 0) {
//		System.out.println("Primeiro");
//	} else if (x < 0 && y > 0) {
//		System.out.println("Segundo");
//	} else if (x < 0 && y < 0) {
//		System.out.println("Terceiro");
//	} else if (x > 0 && y < 0) {
//		System.out.println("Quarto");
//	}
//	}
//	sc.close();
//}
	/************* Questão 3 ***************/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um codigo:");
		int x = 0,
		Alcool = 0,
		Gasoline = 0,
		Disel = 0 ;
		while ( x != 4 ) {
			x= sc.nextInt();
			if( x == 1) {
				Alcool+= 1;
			}else if(x == 2){
				Gasoline += 1;
			}else if(x == 3) {
				Disel += 1;
			}
		}
		System.out.printf("MUITO OBRIGADO%nAlcool:%d%nGasolina: %d%nDiesel: %d",Alcool,Gasoline,Disel);
	sc.close();	
	}
}
