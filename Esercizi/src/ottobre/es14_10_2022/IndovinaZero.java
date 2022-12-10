package ottobre.es14_10_2022;
import java.util.Scanner;

public class IndovinaZero {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 1. Scrivere un programma IndovinaZero che chiede all’utente di inserire numeri interi uno
		dopo l’altro fino a quando non inserisce il numero 0. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci quanti numeri vuoi, una volta finito digita 0: ");
		
		int n;
		
		do {
			n = input.nextInt();
		} while(n!=0); 
		System.out.println("Hai digitato: 0;");	
	}

}
