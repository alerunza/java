package es23_11_2022;
import java.util.Scanner;

public class MainFrazione {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double num, den;
		
		System.out.println("Inserisci Il valore del Numeratore e del Denominatore per Ordine");
		num = input.nextDouble();
		den = input.nextDouble();
		
		System.out.println();
		
		Frazione fratto = new Frazione(num, den);
		
		fratto.CalcolaMCD();
		
		System.out.println();
		
		fratto.Mostra();
		
		System.out.println();
		
		fratto.Semplifica();
		
		System.out.println();
		
		fratto.Mostra();
	}

}
