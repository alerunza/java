package febbraio.es04_02_2023;

public class MainPoint {

	public static void main(String[] args) {
		Point punti = new Point(3, 4);
		punti.checkXY(1, 1);
		punti.moveX(2);
		punti.checkXY(2, 1);
	}

}
