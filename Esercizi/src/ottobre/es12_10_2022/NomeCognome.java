package es12_10_2022;
import java.util.Scanner;

public class NomeCognome {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 1. Scrivere un programma NomeCognome che scrive il
	   	vostro nome e il vostro cognome uno sotto l’altro. */ 
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo Nome: ");
		String nome, cognome;
		nome = input.next();
		System.out.println("Inserisci il tuo Cognome: ");
		cognome = input.next();
		System.out.println("Nome: " + nome + "\nCognome: " + cognome);
	}

}
