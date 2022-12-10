package ottobre.es14_10_2022;
import java.util.Scanner;

public class Uguali2 {

	public static void main(String[] args) {
		/* CONSEGNA: Esercizio 2. Modificare il programma Uguali dell’esecizio 1 in modo che usi un unico comando if privo
		del ramo else (suggerimento: notate che i due messaggio da stampare hanno una parte in comune che
		viene stampata comunque...) */
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Inserisci due numeri: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		if((n1==n2) || (n1!=n2)) {
			System.out.println(n1 + " e " + n2);
		}
		
	}

}
