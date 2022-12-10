package ottobre.es14_10_2022;
import java.util.Scanner;

public class MediaNumeri {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 5. Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza di
		numeri interi positivi. Non appena l’utente inserisce un numero negativo il programma si arresta e
		visualizza la media aritmetica dei valori positivi inseriti (senza approssimazione!). */
		
		Scanner input = new Scanner(System.in);
		
		int n, i = 0;
		double somma = 0;
		
		do {
			System.out.println("Inserisci un numero: ");
			n = input.nextInt();
			if(n>0) {
				somma+=n;
			}
			i++;
		} while(n>=0);
		
		i--;
		double media = somma / i;
		System.out.println("La tua media è: " + media);
	}

}
