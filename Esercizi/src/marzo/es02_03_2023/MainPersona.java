package marzo.es02_03_2023;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		System.out.println("Inserisci Il tuo Codice Fiscale, Nome, Cognome, Matricola e Università");
		Studente toto = new Studente(new Scanner(System.in).next(), new Scanner(System.in).next(), new Scanner(System.in).next(), new Scanner(System.in).next(), new Scanner(System.in).next());
		
		System.out.println(toto.toString());
	}

}
