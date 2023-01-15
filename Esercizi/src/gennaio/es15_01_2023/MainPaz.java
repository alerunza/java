package gennaio.es15_01_2023;

import java.util.Scanner;

public class MainPaz {

	public static void main(String[] args) {
		Paz pazienti = new Paz();
		Scanner input = new Scanner(System.in);
		
		String[] codapazienti = {"Alessandro Runza", "Stefano Tarallo", "Matt Kirby", "Paul Cooper"};
		for(int i = 0; i < codapazienti.length; i++) {
			pazienti.insPaz(codapazienti[i]);
		}
//		pazienti.insPaz("Alessandro");
//		pazienti.insPaz("Michele");
//		pazienti.insPaz("Stefano");
//		pazienti.insPaz("Giosue'");
//		pazienti.listPaz();
//		pazienti.stampaPaz("Stefano");
//		pazienti.delPaz("Michele");
//		pazienti.listPaz();
//		pazienti.stampaPaz("Stefano");
		
		System.out.println("Benvenuto nello studio Medico - Runza \nInserisci i dati di un paziente da inserire nella lista d'attesa: Nome & Cognome");
		
		String nome = input.next();
		String cognome = input.next();
		
		pazienti.insPaz(nome + " " + cognome);
		
		System.out.println();
		
		pazienti.listPaz();
		
		System.out.print("\nIl Primo paziente si puo' accomodare: ");
		pazienti.stampaPaz("Alessandro Runza");
		pazienti.delPaz("Alessandro Runza");
		
		System.out.println("\nLista Pazienti Aggiornata\n");
		pazienti.listPaz();
	}

}
