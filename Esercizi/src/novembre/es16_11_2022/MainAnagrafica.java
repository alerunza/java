package es16_11_2022;
import java.util.Scanner;

public class MainAnagrafica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome, cognome, email;
		
		System.out.println("Inserisci NOME");
		nome = input.next();
		
		System.out.println("Inserisci COGNOME");
		cognome = input.next();
		
		System.out.println("Inserisci la tua EMAIL (Ricorda di inserire @dominio.com) altrimenti non verra' registrata");
		email = input.next();
		
		System.out.println();
		
		Anagrafica dati = new Anagrafica(nome, cognome, email);
		
		dati.registraMail();
		dati.stampaDati();
		
		System.out.println();
		
		dati.setNome("Ale");
		dati.setCognome("Runza");
		dati.setMail("alerunza@chvbs.com");
		dati.registraMail();
		dati.stampaDati();
	}

}
