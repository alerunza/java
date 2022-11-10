package es10_11_2022;

public class Circonferenza {
	private double r;
	private final double PI = 3.14;
	
	public Circonferenza(double raggio) {
		r = raggio;
	}
	
	public void AreaR(double raggio) {
		double area = 0;
		
		area = r * r * PI;
		
		System.out.println(area);
	}
}
