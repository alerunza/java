package dicembre.es16_12_2022;

public class Car {
	public double chilometri;
	private double carburante;
	
	public Car (double autonomia, double benzina) {
		this.chilometri = autonomia;
		this.carburante = benzina;
	}
	
	public void Drive (double km) {
		this.carburante = this.carburante - (km / this.chilometri);
	}
	
	public double getCarburante () {
		return this.carburante;
	}
	
	public void addGas(double carburantenew) {
		this.carburante = this.carburante + carburantenew;
	}
}
