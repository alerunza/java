package gennaio.es31_01_2023;

public class Cilindro extends Cerchio {
	public double altezza;
	
	
	public Cilindro(double r, double h) {
		super(r);
		this.altezza = h;
	}
	
	
	public void setAltezza(double h) {
		this.altezza = h;
	}
	
	public double Volume() {
		return Math.PI * this.raggio * this.raggio * this.altezza;
	}
}
