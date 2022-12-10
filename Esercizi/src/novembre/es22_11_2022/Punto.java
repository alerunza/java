package es22_11_2022;
import java.lang.Math;

public class Punto {
	private double x, y;
	private double x2, y2;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto(double x, double x2, double y, double y2) {
		this.x = x;
		this.y = y;
		
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void LocalizzaQuadrante() {
		if((y>0) && (x>0)) {
			System.out.println("P (" + x + ", " + y + ")" + "\nQuesti PUNTI si trovano nel 1° Quadrante");
		}
		if((y>0) && (x<0)) {
			System.out.println("P (" + x + ", " + y + ")" + "\nQuesti PUNTI si trovano nel 2° Quadrante");
		}
		if((y<0) && (x<0)) {
			System.out.println("P (" + x + ", " + y + ")" + "\nQuesti PUNTI si trovano nel 3° Quadrante");
		}
		if((y<0) && (x>0)) {
			System.out.println("P (" + x + ", " + y + ")" + "\nQuesti PUNTI si trovano nel 4° Quadrante");
		}
		if((x==0) && (y==0)) {
			System.out.println("P (" + x + ", " + y + ")" + "\nQuesti PUNTI si trovano all'Origine");
		}
	}
	
	public void CalcolaDistanzaTraDuePunti() {
		double distanza = 0;
		
		distanza = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
		
		System.out.println("Distanza Tra Due Punti: " + distanza);
	}
}
