package es12_10_2022;
import java.util.Scanner;

public class SommaDiQuattro {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 5. Scrivere un programma SommaDiQuattro che chiede
		all’utente di inserire quattro valori interi, e ne stampa la somma. ATTENZIONE:
		il programma deve utilizzare in tutto solo 2 variabili! */
		
		Scanner input = new Scanner(System.in);
		int numeri, somma = 0;
		System.out.println("Inserisci 4 numeri: ");
		for(int i = 0; i<4; i++) {
			numeri = input.nextInt();
			somma+=numeri;
		}
		System.out.println("Somma (4): " + somma);
	}

}
