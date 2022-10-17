package es12_10_2022;
import java.util.Scanner;

public class PerimetroRettangolo {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 2. Scrivere un programma PerimetroRettangolo che
		calcola il perimetro  e l’area di un
		rettangolo di base e altezza definiti dall’utente. */
		Scanner input = new Scanner(System.in);
		double base, altezza;
		System.out.println("Inserisci la base del RETTANGOLO: ");
		base = input.nextDouble();
		System.out.println("Inserisci l'altezza del RETTANGOLO");
		altezza = input.nextDouble();
		double area, perimetro;
		perimetro = (2 * base) + (2 * altezza);
		area = base * altezza;
		System.out.println("Perimetro del RETTANGOLO: " + perimetro + "\nArea del RETTANGOLO: " + area);
		
	}

}
