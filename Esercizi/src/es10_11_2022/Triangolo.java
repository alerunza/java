package es10_11_2022;

public class Triangolo {

	private double a, b, c;
	
	// scaleno
	public Triangolo(double lato1, double lato2, double lato3){
		a = lato1;
		b = lato2;
		c = lato3;
	}
	
	// isoscele
	public Triangolo(double lato1, double lato2){
		a = b = lato1;
		c = lato2;
	}
	
	// equilatero
	public Triangolo(double lato){
		a = b = c = lato;
	}
	
	public Triangolo() {
		
	}
	
	// equilatero
	public void PerimetroE(double lato1) {
		double perimetro = 0;
		
		perimetro = 3 * lato1;
		
		System.out.println(perimetro);
	}
	
	// scaleno
	public void PerimetroS(double lato1, double lato2, double lato3) {
		double perimetro = 0;
		
		perimetro = lato1 + lato2 + lato3;
		
		System.out.println(perimetro);
	}
	
	// isoscele
	public void PerimetroI(double lato1, double lato2) {
		double perimetro = 0;
		
		perimetro = lato1 + lato2 * 2;
		
		System.out.println(perimetro);
	}
	
}
