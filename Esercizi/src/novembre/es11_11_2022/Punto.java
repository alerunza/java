package novembre.es11_11_2022;

public class Punto {
	private double x, y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
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
}
