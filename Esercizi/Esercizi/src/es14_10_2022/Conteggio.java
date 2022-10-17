package es14_10_2022;
import java.util.Scanner;

public class Conteggio {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 3. Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore o
		uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. Se il valore
		nserito dall’utente `e negativo il programma stampa un messaggio di errore. */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("Si è verificato un errore");
		}
		
		for(int i = 0; i<=n; i++) {
			System.out.println(i);
		}
	}

}
