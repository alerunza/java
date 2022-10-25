package es14_10_2022;
import java.util.Scanner;

public class ScrivoScrivoScrivo {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 2. Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire un numero
		maggiore o uguale a zero e stampa il messaggio "sto ciclando" un numero di volte pari al numero inserito
		dall’utente. Se il valore inserito dall’utente `e negativo il programma stampa un messaggio di errore. */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("Si è verificato un errore");
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println("sto ciclando" + " - " + (i+1));
		}
		
	}

}
