package ottobre.es14_10_2022;
import java.util.Scanner;

public class Ordina3Valori {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 4. Scrivere un programma Ordina3Valori che chiede all’utente di inserire tre numeri interi
		e stampa su un’unica riga in ordine crescente. */
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("Inserisci tre numeri: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		if(n1<n2) {
			if(n1<n3) {
				if(n2<n3) {
					System.out.println(n1 + " " + n2 + " " + n3);
				} else {
					System.out.println(n1 + " " + n3 + " " + n2);
				}
			} else {
				System.out.println(n3 + " " + n1 + " " + n2);
			}
		} else {
			if(n2<n3) {
				if(n1<n3) {
					System.out.println(n2 + " " + n1 + " " + n3);
				} else {
					System.out.println(n2 + " " + n3 + " " + n1);
				}
			} else { 
				System.out.println(n3 + " " + n2 + " " + n1);
			}
		}
		
	}

}
