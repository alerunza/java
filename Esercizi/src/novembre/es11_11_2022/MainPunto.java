package novembre.es11_11_2022;
import java.util.Scanner;

public class MainPunto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x, y;
		
		System.out.print("Inserisci il valore del punto X: ");
		x = input.nextDouble();
		System.out.print("Inserisci il valore del punto Y: ");
		y = input.nextDouble();
		
		Punto punti = new Punto(x, y);
		
		punti.LocalizzaQuadrante();
	}

}
