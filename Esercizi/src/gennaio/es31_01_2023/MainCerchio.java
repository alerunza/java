package gennaio.es31_01_2023;
import java.util.Scanner;

public class MainCerchio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio e l'altezza");
		double raggio = input.nextDouble();
		double altezza = input.nextDouble();
		
		
		Cilindro cili = new Cilindro(raggio, altezza);
		
		System.out.println("Il Volume del tuo Cilindro e': " + cili.Volume());

	}

}
