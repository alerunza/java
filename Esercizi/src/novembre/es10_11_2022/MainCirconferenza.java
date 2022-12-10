package es10_11_2022;
import java.util.Scanner;

public class MainCirconferenza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raggio;
		
		System.out.println("Inserisci il RAGGIO del Cerchio");
		raggio = input.nextDouble();
		
		Circonferenza cerchio = new Circonferenza(raggio);
		
		cerchio.AreaR();
		cerchio.PerimetroR();

	}

}
