package febbraio.es24_02_2023;

import java.util.Scanner;

public class MainBorsa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il Nome del Beneficiario");
		String beneficiario = input.next();
		
		System.out.println("Inserisci il Nome dell'ente");
		String ente = input.next();
		
		System.out.println("Inserisci la Durata Mensile della Borsa di Studio");
		int durata = input.nextInt();
		
		System.out.println("Inserisci la Rata Mensile");
		double ratamensile = input.nextDouble();
		
		BorsaStudio borsetta = new BorsaStudio(beneficiario, ente, durata, ratamensile);
		
		System.out.println("Borsa di Studio assegnata da " + borsetta.getEnte() + "\n" + borsetta.getBorsaDesc() + "\nCon una rata mensile di " + borsetta.getRata() + "€ con una durata di " + borsetta.getDurata());
		
		System.out.println("\nInserisci la Tematica della Borsa di Studio");
		String tema = input.next();
		
		System.out.println("\nInserisci il Dipartimento Richiedente della Borsa di Studio");
		String dep = input.next();
		
		AssegnoRicerca assegno = new AssegnoRicerca(beneficiario, ente, durata, ratamensile, tema, dep);
		
		System.out.println("\nAssegno di Ricerca: \n" + assegno.getAssegnoRicerca());
		
		if(!assegno.checkDep("Biology")) {
			System.out.println("Il Dipartimento Richiedente: " + assegno.getDipartimento() + " - è diverso da quello inserito");
		} else {			
			System.out.println("Il Dipartimento Richiedente è uguale da quello richiesto");
		}
	}

}
