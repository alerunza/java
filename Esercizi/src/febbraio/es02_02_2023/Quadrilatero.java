package febbraio.es02_02_2023;

public class Quadrilatero {
	public double AB, BC, CD, DA;
	
    public Quadrilatero() {
    	AB = BC = CD = DA = 0;
    }
	
	public Quadrilatero(double A, double B, double C, double D) {
		this.AB = A;
		this.BC = B;
		this.CD = C;
		this.DA = D;
	}
	
	public double Perimetro() {
		return this.AB + this.BC + this.CD + this.DA;
	}
	
	public double Area() {
		double semiP = 0;
		semiP = (AB + BC + CD + DA) / 2;
		
		double area = 0;
		area = Math.sqrt((semiP-AB) * (semiP-BC) * (semiP-CD) * (semiP-DA));
		
		return area;
	}
}
