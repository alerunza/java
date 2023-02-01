package febbraio.es01_02_2023;

public class Rectangle extends Square {
	public double altezza;
	
	public Rectangle(double lato, double h) {
		super(lato);
		this.altezza = h;
	}
	
	@Override
	public double Area() {
		return this.lato * this.altezza;
	}
	
	@Override
	public double Perimetro() {
		return (2 * this.lato) + (2 * this.altezza);
	}

}
