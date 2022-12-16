package dicembre.es16_12_2022;

public class Cellulare {
	private double carica;
	private int numeroChiamate;
	
	//soldi iniziali (prima ricarica)
	public Cellulare (double unaCarica) {
		this.carica = unaCarica;
	}
	
	//ricarica telefonica
	public void ricarica(double unaRicarica) {
		carica = unaRicarica;
		
		System.out.println("Hai effettuato una ricarica di " + unaRicarica + "€");
	}
	
	public void chiama(double minutiDurata) {
		 double costo = 0;
		 costo = minutiDurata * 0.20;
		 
		 this.carica = this.carica - costo;
		 
		 numeroChiamate++;
		 
		 System.out.println("Hai effettuato una chiamata da " + minutiDurata + " minuti, ti sono stati scalati dal tuo conto: " + costo + "€");
	}
	
	public double numero404() {
		return this.carica;
	}

	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
	
	public double getCarica() {
		return carica;
	}

	public int getNumeroChiamate() {
		return numeroChiamate;
	}

	public void setNumeroChiamate(int numeroChiamate) {
		this.numeroChiamate = numeroChiamate;
	}
}
