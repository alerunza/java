package febbraio.es04_02_2023;

public class Circle extends Point {
	public double raggio = 0;
	
	public Circle(double x, double y, double r) {
		super(x, y);
		this.raggio = r;
	}
	
	public Circle() {
		this.raggio = 1;
	}
	
	public Circle(double x, double y) {
		super(x, y);
		this.raggio = 1;
	}
	
	public String toString(double punto) {
		return Double.toString(punto);
	}
	
	public void scaleR(double multiplier) {
		this.raggio = this.raggio * multiplier;
		
		System.out.println("Il Raggio e' stato moltiplicato per " + multiplier + ", la sua dimensione ora e' di " + this.raggio);
	}
	
	public void checkCircle(double r) {
		if(r == this.raggio) {
			System.out.println("Il Cerchio con raggio: " + this.raggio + "; e' uguale al Cerchio con raggio: " + r);
		} else {
			System.out.println("I due Cerchi non hanno lo stesso raggio");
		}
	}
}
