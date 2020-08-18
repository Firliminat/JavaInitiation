import java.util.Locale;
import java.util.Scanner;

public class Degre3 {

	public static void main(String[] args) {
		int a = -1, b = 1, c = 0;
		double x = 0.0;
		

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Entrez a (int) : ");
		a = scanner.nextInt();
		System.out.print("Entrez b (int) : ");
		b = scanner.nextInt();
		System.out.print("Entrez c (int) : ");
		c = scanner.nextInt();
		System.out.print("Entrez x (double) : ");
		x = scanner.nextDouble();
		
		scanner.close();

		double xCarre = x * x;
		double aPlusB = a + b;
		
		double imagePolynome = aPlusB * xCarre * x / 2.0 + aPlusB * aPlusB * xCarre + aPlusB + c;
		
		System.out.println("La valeur du polynôme est : " + imagePolynome);
		
	}

}
