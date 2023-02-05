package febbraio.es04_02_2023;

public class Main {

	public static void main(String[] args) {
		Point punti = new Point(3, 4);
		punti.checkXY(1, 1);
		punti.moveX(2);
		punti.checkXY(2, 1);
		
		Circle cerchio = new Circle(2, 5, 8);
		cerchio.checkCircle(8);
		cerchio.scaleR(3);
		cerchio.checkCircle(8);
	}

}
