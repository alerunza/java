package marzo.es01_03_2023;

public class Parallelepipedo extends Rettangolo {
	
	public double larghezza;
	
	public Parallelepipedo(double base, double altezza, double larghezza) {
		super(base, altezza);
		this.larghezza = larghezza;
	}
	
	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getVolume() {
		return (super.getArea() * this.larghezza);
	}
}
