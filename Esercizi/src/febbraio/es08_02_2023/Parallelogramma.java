package febbraio.es08_02_2023;
import java.lang.Math;


public class Parallelogramma {
	public double dMaggiore, dMinore;
	public int angolo = 0;
	
	public double h = 0, e = 0, t = 0, v = 0, base = 0;

	public Parallelogramma(double dMaggiore, double dMinore, int angolo) {
		this.dMaggiore = dMaggiore;
		this.dMinore = dMinore;
		this.angolo = angolo;
	}
	
	public void calcola() {
		h = this.dMaggiore * Math.sin(this.angolo);
		
		e = Math.asin(Math.toRadians(h/this.dMinore));
		
		double test = 0, test2 = 0, test3 = 0;
		test = Math.pow(h, 2);
		test2 = Math.pow(this.dMaggiore/2, 2);
		test3 = test2 - test;
		t = Math.sqrt(test3);
		
		
		v = (this.dMinore/2) * Math.cos(e);
		System.out.println(v + " " + test3);
		
		base = v + t;
		
		System.out.println("L'altezza del Parallelogramma e': " + h + "\nL'angolo della Diagonale Minore e': " + e + "\nL'angolo della Diagonale Maggiore e': " + this.angolo + "\nLa Base del Parallelogramma e': " + base);
	}
	
	public void Area() {
		double area = 0;
		area = base * h;

		System.out.println("L'Area del Parallelogramma e': " + area);
	}
	
	public void Perimetro() {
		double perimetro = 0;
		perimetro = (base*2) + ((Math.sqrt(Math.pow(h+v, 2))));
		
		System.out.println("Il Perimetro del Parallelogramma e': " + perimetro);
	}
	
}
