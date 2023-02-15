package febbraio.es15_02_2023;

import java.util.Scanner;

public class MainPolizza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il Modello dell'Auto");
		String veh = input.next();
		
		System.out.println("Inserisci la Targa dell'Auto");
		String targa = input.next();
		
		System.out.println("Inserisci il Valore Assicurativo dell'Auto");
		int valore = input.nextInt();
		
		PolizzaBase polizza = new PolizzaBase(veh, targa, valore);
		
		System.out.println("Modello: " + polizza.getVeicolo() + "Targa: " + polizza.getTarga() + "Valore Assicurativo: " + polizza.getAssicurato());
		
		System.out.println("Vuoi inserire la Polizza Incendio e Furti? (yes/no)");
		String scelta = input.next();
		
		if(scelta.toLowerCase().contains("yes") || scelta.toLowerCase().contains("no")) {
			System.out.println("Inserisci il valore della polizza Incendio & Furti");
			int valfuoco = input.nextInt();
			PolizzaIncendioFurto furtoincendio = new PolizzaIncendioFurto(veh, targa, valore, valfuoco);
			
			System.out.println("Premio Annuale" + furtoincendio.PremioAnnuale());
		}else {
			System.out.println("Arrivederci");
		}
	}

}
