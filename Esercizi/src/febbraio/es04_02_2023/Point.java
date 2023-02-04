package febbraio.es04_02_2023;

public class Point {
	public double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public String toString(double punto) {
		return Double.toString(punto);
	}
	
	public void moveX(double x) {
		System.out.println("Il Punto X da " + this.x + " si e' spostato a " + x);
		this.x = x;
	}
	
	public void moveY(double y) {
		System.out.println("Il Punto Y da " + this.y + " si e' spostato a " + y);
		this.y = y;
	}
	
	public void checkXY(double x, double y) {
		if(x == this.x) {
			if(y == this.y) {
				System.out.println("I Punti X: " + this.x + " Y: " + this.y + "; Sono uguali ai Punti X: " + x + " Y: " + y);
			} else {				
				System.out.println("Il Punto X: " + this.x + " e' uguale al Punto X: " + x);
			}
		} else {
			if(y == this.y) {
				System.out.println("Il Punto Y: " + this.y + " e' uguale al Punto Y: " + y);
			}
			if((y != this.y) && (x != this.x)) {
				System.out.println("I Punti immessi non sono uguali");
			}
		} 
	}
}
