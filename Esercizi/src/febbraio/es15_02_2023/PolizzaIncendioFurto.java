package febbraio.es15_02_2023;

public class PolizzaIncendioFurto extends PolizzaBase {

	public double IncendioFurtoVal = 0;
	
	public PolizzaIncendioFurto(String veh, String plate, int valore, double val) {
		super(veh, plate, valore);
		this.IncendioFurtoVal = val;
	}

	public double getIncendioFurtoVal() {
		return IncendioFurtoVal;
	}
	
	public double PremioAnnuale() {
		return (this.assicurato + this.IncendioFurtoVal) / 100;
	}
}
