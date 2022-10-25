package es25_10_2022;
import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("Quale operazione matematica vuoi svolgere?");
		System.out.println("1) Somma\n2) Sottrazione\n3) Moltiplicazione\n4) Divisione (intera)");
		int scelta = input.nextInt();

		switch(scelta) {
		case 1:
			System.out.println("Somma: " + (x + y));
			break;
		case 2:
			System.out.println("Sottrazione: " + (x - y));
			break;
		case 3:
			System.out.println("Moltiplicazione: " + (x * y));
			break;
		case 4:
			System.out.println("Divisione: \nQuoziente: " + (x / y) + "\nResto: " + (x % y));
			break;
		}
	}

}
