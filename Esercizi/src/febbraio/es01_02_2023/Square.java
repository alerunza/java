package febbraio.es01_02_2023;

public class Square {
	public double lato;
	
	public Square(double lato) {
		this.lato = lato;
	}
	
	public double Area() {
		return lato * lato;
	}
	
	public double Perimetro() {
		return 4 * lato;
	}
}
