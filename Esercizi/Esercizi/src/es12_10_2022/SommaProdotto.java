package es12_10_2022;
import java.util.Scanner;

public class SommaProdotto {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 3. Scrivere un programma SommaProdotto che chiede
		all’utente di inserire due valori interi e ne calcola la somma e il prodotto. */
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("Inserisci il primo numero: ");
		n1 = input.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		n2 = input.nextInt();
		int somma, prodotto;
		somma = n1 + n2;
		prodotto = n1 * n2;
		System.out.println("Somma: " + somma + "\nProdotto: " + prodotto);
		
	}

}
