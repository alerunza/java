package es23_11_2022;

public class Frazione {
	private double numeratore, denominatore, r;
	public double MCD = 0;
	
	public Frazione(double numeratore, double denominatore) {
		this.numeratore = numeratore;
		this.denominatore = denominatore;
	}
	
	public void CalcolaMCD() {
		if((numeratore==0) && (denominatore==0)) {
			System.out.println("MCD non valido");
		}
		
		if((numeratore<0) || (denominatore<0)) {
			if(numeratore<0) {
				numeratore = numeratore * -1;
			}
			if(denominatore<0) {
				denominatore = denominatore * -1;
			}
		}
		
		if(numeratore!=denominatore) {
			if(numeratore>denominatore) {
				r = numeratore % denominatore;
				
				while (r != 0) {
					numeratore = denominatore;
					denominatore = r;
					r = numeratore % denominatore;
				}
				
				MCD = denominatore;
			} else {
				MCD = numeratore;
			}
		}
	}
	
	public void Semplifica() {
		numeratore = numeratore / MCD;
		denominatore = denominatore / MCD;
		
		System.out.println("Semplificato: \n" + numeratore + "\n----\n" + denominatore);
	}
	
	public void Mostra() {
		System.out.println("Mostra: \n" + numeratore + "\n----\n" + denominatore);
	}

	public double getMCD() {
		return MCD;
	}

	public void setNumeratore(double numeratore) {
		this.numeratore = numeratore;
	}

	public void setDenominatore(double denominatore) {
		this.denominatore = denominatore;
	}
}
