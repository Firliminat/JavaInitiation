import java.util.Locale;
import java.util.Scanner;

public class Echange {

	public static void main(String[] args) {
		int x = 0, y = 1, tmp = x;

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Entrez x: ");
		x = scanner.nextInt();
		System.out.print("Entrez y: ");
		y = scanner.nextInt();
		
		System.out.println("Avant permutation:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		scanner.close();

		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("Apres permutation:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
