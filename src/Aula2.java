import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String z;
		double x;
		int y;

		z = sc.next();
		y = sc.nextInt();
		x = sc.nextDouble();

		String s1, s2, s3;
		int h;

		h = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Voce digitou:" + x);
		System.out.println("Voce digitou:" + z);
		System.out.println("Voce digitou:" + y);
		System.out.println(h);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
