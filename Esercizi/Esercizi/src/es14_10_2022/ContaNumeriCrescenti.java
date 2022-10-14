package esercizi14_10_2022;
import java.util.Scanner;

public class ContaNumeriCrescenti {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 4. Scrivere un programma ContaNumeriCrescenti che chiede all’utente di inserire una sequenza di
		numeri interi crescenti (man mano sempre pi`u grandi) e ne stampa la lunghezza (il numero
		di valori inseriti dall’utente). Il programma termina non appena l’utente inserisce un valore minore o
		uguale al precedente). */

		Scanner input = new Scanner(System.in);
		int n1, n2 = 0, i = 0;
		
		do {			
			System.out.println("Inserisci il prossimo numero: ");
			n1 = input.nextInt();
			System.out.println(n1 + " " + n2);
			n2 = n1;
			
		} while(n1<=n2);
		
		
		
		System.out.println("Hai immesso una sequenza di numeri crescenti lunga: " + (i+1));
		
	}

}
