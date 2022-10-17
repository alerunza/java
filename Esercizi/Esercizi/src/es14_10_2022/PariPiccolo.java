package es14_10_2022;
import java.util.Scanner;

public class PariPiccolo {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 5. Scrivere un programma PariPiccolo che chiede all’utente di inserire un numero intero
		e visualizza il messaggio &quot;Pari e Piccolo&quot; se il numero `e pari ed `e compreso tra 0 e 100, altrimenti
		stampa il messaggio &quot;Non e’ pari e piccolo&quot;. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if(n%2==0) {
			if((n>=0) && (n<=100)) {
				System.out.println("Pari e Piccolo");
			}
		} else {
			if((n>=0) && (n<=100)) {
				System.out.println("Non è pari e Piccolo");
			}
		}
	}

}
