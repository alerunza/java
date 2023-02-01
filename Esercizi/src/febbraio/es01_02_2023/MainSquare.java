package febbraio.es01_02_2023;

public class MainSquare {

	public static void main(String[] args) {
		Square quadrato = new Square(30);
		
		System.out.println("Area del quadrato: " + quadrato.Area() + "\nPerimetro del quadrato: " + quadrato.Perimetro());
		
		Rectangle rettangolo = new Rectangle(40, 20);
		
		System.out.println("Area del rettangolo: " + rettangolo.Area() + "\nPerimetro del rettangolo: " + rettangolo.Perimetro());
		
	}

}
