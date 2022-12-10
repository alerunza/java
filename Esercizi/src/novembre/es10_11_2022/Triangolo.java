package novembre.es10_11_2022;

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
	public void PerimetroE() {
		double perimetro = 0;
		
		perimetro = 3 * this.a;
		
		System.out.println(perimetro);
	}
	
	// scaleno
	public void PerimetroS() {
		double perimetro = 0;
		
		perimetro = this.a + this.b + this.c;
		
		System.out.println(perimetro);
	}
	
	// isoscele
	public void PerimetroI() {
		double perimetro = 0;
		
		perimetro = this.a + this.b * 2;
		
		System.out.println(perimetro);
	}
	
}
