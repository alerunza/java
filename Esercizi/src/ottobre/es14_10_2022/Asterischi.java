package ottobre.es14_10_2022;
import java.util.Scanner;

public class Asterischi {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 6. Scrivere un programma Asterischi che chiede all’utente di inserire un numero intero e
		stampa un triangolo fatto di asterischi con un numero di righe pari al valore inserito dall’utente. Se
		l’utente inserisce un valore negativo il programma deve visualizzare un messaggio di errore. */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("Si è verificato un errore");
		}
		
		int i;
		
		for(i = 1; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
