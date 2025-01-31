import java.util.Locale;
import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		
		final int BASE = 4;
		int nbConvives = BASE;
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Entrez le nombre de personne(s) conviées à la fondue : ");
		nbConvives = scanner.nextInt();
		
		scanner.close();

		fromage = nbConvives * fromage / BASE;
		eau = nbConvives * eau / BASE;
		ail = nbConvives * ail / BASE;
		pain = nbConvives * pain / BASE;
		
		System.out.println("Pour faire une fondue fribourgeoise pour 3 personnes, il vous faut :");
		System.out.println(" - " + fromage + " gr de Vacherin fribourgeois");
		System.out.println(" - " + eau + " dl d'eau");
		System.out.println(" - " + ail + " gousse(s) d'ail");
		System.out.println(" - " + pain + " gr de pain");
		System.out.println(" - du poivre a volonte");
		
	}
	
}
