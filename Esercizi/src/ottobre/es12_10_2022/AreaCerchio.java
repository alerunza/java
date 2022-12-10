package es12_10_2022;
import java.util.Scanner;

public class AreaCerchio {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 4. Scrivere un programma AreaCerchio che chiede
		all’utente di inserire la lunghezza del raggio di un cerchio e ne calcola
		l’area. ATTENZIONE: memorizzare il valore di pi-greco in una costante. */
		
		Scanner input = new Scanner(System.in);
		double raggio, area;
		final double pigreco = 3.14;
		System.out.println("Inserisci il RAGGIO del tuo cerchio: ");
		raggio = input.nextDouble();
		area = (raggio * raggio) * pigreco;
		System.out.println("Area: " + area);
	}

}
