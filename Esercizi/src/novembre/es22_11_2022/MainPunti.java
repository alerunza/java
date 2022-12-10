package novembre.es22_11_2022;
import java.util.Scanner;

public class MainPunti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		
		System.out.println("Inserisci i PUNTI (x1, x2, y1, y2)");
		x1 = input.nextDouble();
		x2 = input.nextDouble();
		y1 = input.nextDouble();
		y2 = input.nextDouble();
		
		Punto punti = new Punto (x1, x2, y1, y2);
		
		punti.CalcolaDistanzaTraDuePunti();
		
	}

}
