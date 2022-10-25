package es14_10_2022;
import java.util.Scanner;

public class Uguali {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 1. Scrivere un programma Uguali che chiede all’utente di inserire due numeri interi e stampa
		il messaggio &quot;sono uguali!&quot; se i due numeri sono uguali e &quot;non sono uguali!&quot; se i due numeri non
		lo sono. */
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Inserisci due numeri: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		if(n1==n2) {
			System.out.println(n1 + " e " + n2 + " sono uguali");
		} else {
			System.out.println(n1 + " e " + n2 + " non sono uguali");
		}
		
	}

}
