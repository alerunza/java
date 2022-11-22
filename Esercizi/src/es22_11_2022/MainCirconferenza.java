package es22_11_2022;
import java.util.Scanner;

public class MainCirconferenza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raggio, raggio2;
		
		System.out.println("Inserisci il Raggio del Primo Cerchio");
		raggio = input.nextDouble();
		
		System.out.println("Inserisci il Raggio del Secondo Cerchio");
		raggio2 = input.nextDouble();
		
		Circonferenza cerchio1 = new Circonferenza(raggio);
		
		cerchio1.CirconferenzaR();
		cerchio1.AreaR();
		cerchio1.Arrotondamento();
		
		System.out.println();
		
		Circonferenza cerchio2 = new Circonferenza(raggio2);
		
		cerchio2.CirconferenzaR();
		cerchio2.AreaR();
		cerchio2.Arrotondamento();
	}

}
