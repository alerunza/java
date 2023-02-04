package febbraio.es04_02_2023;

public class MainCircle {

	public static void main(String[] args) {
		Circle cerchio = new Circle(2, 5, 8);
		
		cerchio.checkCircle(8);
		cerchio.scaleR(3);
		cerchio.checkCircle(8);
	}

}
