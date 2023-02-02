package febbraio.es02_02_2023;

public class Trapezio extends Quadrilatero {
	public double baseMaggiore, baseMinore;
	
	public Trapezio(double A, double B, double C, double D) {
		super(A, B, C, D);
		this.baseMaggiore = A;
		this.baseMinore = C;
	}
	
	public double Perimetro() {
		return baseMinore + baseMaggiore + this.BC + this.DA;
	}
	
	public double Area() {
		return ((baseMinore + baseMaggiore) * this.DA) / 2;
	}
}
