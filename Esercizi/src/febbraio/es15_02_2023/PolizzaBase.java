package febbraio.es15_02_2023;

public class PolizzaBase {
	public String veicolo, targa = "null";
	public int assicurato = 0;

	public PolizzaBase(String veh, String plate, int valore) {
		this.veicolo = veh;
		this.targa = plate;
		this.assicurato = valore;
	}
	
	public String getVeicolo() {
		return this.veicolo;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	public int getAssicurato() {
		return this.assicurato/100;
	}
	
}
