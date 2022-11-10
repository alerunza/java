package es10_11_2022;
import java.util.Scanner;

public class esercitazione {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double l1, l2, l3;
		int scelta;
		System.out.println("Scegli il tipo di TRIANGOLO:\n1 - Equilatero\n2 - Scaleno\n3 - Isoscele");
		scelta = input.nextInt();
		
		if(scelta>=1 && scelta<=3) {
			if(scelta==1) {
				System.out.println("Inserisci il lato del TRIANGOLO Equilatero");
				l1 = input.nextDouble();
				Triangolo tr1 = new Triangolo(l1);
				tr1.PerimetroE(l1);
			}
			if(scelta==2) {
				System.out.println("Inserisci i 3 lati del TRIANGOLO Scaleno");
				l1 = input.nextDouble();
				l2 = input.nextDouble();
				l3 = input.nextDouble();
				Triangolo tr1 = new Triangolo(l1, l2, l3);
				tr1.PerimetroS(l1, l2, l3);
			}
			if(scelta==3) {
				System.out.println("Inserisci i 2 lati del TRIANGOLO Isoscele");
				l1 = input.nextDouble();
				l2 = input.nextDouble();
				Triangolo tr1 = new Triangolo(l1, l2);
				tr1.PerimetroI(l1, l2);
			}
		} else {
			System.out.println("Inserisci un numero compreso tra 1 e 3");
		}
	}

}
