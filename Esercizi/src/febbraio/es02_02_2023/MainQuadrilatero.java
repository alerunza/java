package febbraio.es02_02_2023;

public class MainQuadrilatero {

	public static void main(String[] args) {
		Quadrilatero quadri = new Quadrilatero(9, 7, 3, 2);
		System.out.println("Quadrilatero:\nIl Perimetro del Quadrilatero e': " + quadri.Perimetro() + "\nL'area del Quadrilatero e': " + quadri.Area());
		
		Trapezio trape = new Trapezio(12, 3, 7, 2);
		System.out.println("Trapezio:\nIl Perimetro del Trapezio e': " + trape.Perimetro() + "\nL'area del Trapezio e': " + trape.Area());
		
	}

}
