package febbraio.es24_02_2023;

public class MainBorsa {

	public static void main(String[] args) {
		BorsaStudio borsetta = new BorsaStudio("Michele", "Polimi", 4, 345);
		
		System.out.println("Borsa di Studio assegnata da " + borsetta.getEnte() + "\n" + borsetta.getBorsaDesc() + "\nCon una rata mensile di " + borsetta.getRata() + "€ con una durata di " + borsetta.getDurata());
		
		AssegnoRicerca assegno = new AssegnoRicerca("Michele", "Polimi", 4, 345, "IT", "Computer Science");
		
		System.out.println("\nAssegno di Ricerca: \n" + assegno.getAssegnoRicerca());
		
		if(!assegno.checkDep("Biology")) {
			System.out.println("Il Dipartimento Richiedente: " + assegno.getDipartimento() + "; è diverso da quello inserito");
		} else {			
			System.out.println("Il Dipartimento Richiedente è uguale da quello richiesto");
		}
	}

}
