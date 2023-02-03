package febbraio.es02_02_2023;

public class MainLavoratore {

	public static void main(String[] args) {
		Lavoratore BOB = new Lavoratore("Bob", 1, 1200);
		BOB.stampaStipendio();
		
		System.out.println();
		
		LavoratoreConStraordinariPagati JACK = new LavoratoreConStraordinariPagati("Jack", 1, 1300, 9);
		JACK.stampaStipendio();
		JACK.stampaStraordinari();
	}

}
