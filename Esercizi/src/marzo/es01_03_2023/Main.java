package marzo.es01_03_2023;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la base");
		double base = input.nextDouble();
		
		System.out.println("Inserisci l'altezza");
		double altezza = input.nextDouble();
		
		Rettangolo Rett = new Rettangolo (base, altezza);
		System.out.println("L'area del rettangolo : " + Rett.getArea());
		
		System.out.println("Inserisci la larghezza del parallelepipedo ");
		double larghezza = input.nextDouble();
		
		Parallelepipedo Parallele = new Parallelepipedo(base, altezza, larghezza);
		System.out.println("Volume del parallelepipedo: " + Parallele.getVolume());
	}

}