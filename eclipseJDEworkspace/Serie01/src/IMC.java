import java.util.Locale;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		double poids = 74.5 ;
		double taille = 1.75 ;

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Entrez un poids (en kg) : ");
		poids = scanner.nextDouble();
		System.out.print("Entrez une taille (en m) : ");
		taille = scanner.nextDouble();
		
		scanner.close();
		
		double imc = poids / (taille * taille);
		
		System.out.println("Pour " + poids
				+ " kg et " + taille
				+ " m, l'IMC est de " + imc);
	}

}
