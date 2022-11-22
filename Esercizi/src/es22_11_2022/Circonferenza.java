package es22_11_2022;
import java.text.DecimalFormat;

public class Circonferenza {
	private double raggio;
	public double area;
	private final DecimalFormat df = new DecimalFormat("0.000");
	//private final double PI = Math.PI;
	
	public Circonferenza(double raggio) {
		this.raggio = raggio;
	}
	
	public void AreaR() {
		area = Math.pow(raggio, 2) * Math.PI;
		
		System.out.println("Area del Cerchio con Raggio: " + raggio + " e' " + area);
	}
	
	public void PerimetroR() {
		double perimetro = 0;
		
		perimetro = 2 * Math.PI * raggio;
		
		System.out.println("Perimetro del Cerchio con Raggio: " + raggio + " e' " + perimetro);
	}
	
	public void CirconferenzaR() {
		double circo = 0;
		
		circo = 2 * raggio * Math.PI;
		
		System.out.println("Circonferenza del Cerchio con Raggio: " + raggio + " e' " + circo);
	}
	
	public void Arrotondamento() {
		System.out.println("Arrotondamento del cerchio con Raggio: " + raggio + " e' " + df.format(area));
	}
}
