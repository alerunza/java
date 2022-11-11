package es10_11_2022;

public class Circonferenza {
	private double raggio;
	//private final double PI = Math.PI;
	
	public Circonferenza(double raggio) {
		this.raggio = raggio;
	}
	
	public void AreaR() {
		double area = 0;
		
		area = Math.pow(raggio, 2) * Math.PI;
		
		System.out.println("Area: " + area);
	}
	
	public void PerimetroR() {
		double perimetro = 0;
		
		perimetro = 2 * Math.PI * raggio;
		
		System.out.println("Perimetro: " + perimetro);
	}
}
