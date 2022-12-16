package dicembre.es16_12_2022;

public class MainCellulare {

	public static void main(String[] args) {
		Cellulare telefonia = new Cellulare (5);
		
		telefonia.chiama(50);
		if(telefonia.getCarica() < 0 ) {
			System.out.println("Attenzione, hai esaurito il tuo credito! Sei in debito di: " + telefonia.getCarica());
		}
		System.out.println("Il tuo saldo e' di: " + telefonia.numero404());
		
		if(telefonia.getNumeroChiamate() > 1) {
			System.out.println("Hai effettuato " + telefonia.getNumeroChiamate() + " chiamate");
		} else {
			System.out.println("Hai effettuato " + telefonia.getNumeroChiamate() + " chiamata");
		}
		
		telefonia.ricarica(25);
		telefonia.chiama(5);
		telefonia.chiama(80);
		
		if(telefonia.getNumeroChiamate() > 1) {
			System.out.println("Hai effettuato " + telefonia.getNumeroChiamate() + " chiamate");
		} else {
			System.out.println("Hai effettuato " + telefonia.getNumeroChiamate() + " chiamata");
		}
	}

}
