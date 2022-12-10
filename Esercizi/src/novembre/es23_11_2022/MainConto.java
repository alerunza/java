package novembre.es23_11_2022;
import java.util.Scanner;

public class MainConto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double soldi, soldiprelevati;
		double saldo = 0;
		
		System.out.println("Inserisci la somma di denaro da versare");
		soldi = input.nextDouble();
		
		System.out.println("Il tuo saldo e' di: " + soldi + "$");
		
		Conto denaro = new Conto (soldi);
		
		System.out.println("Quanti soldi vuoi prelevare?");
		soldiprelevati = input.nextDouble();
		denaro.Preleva(soldiprelevati);
		
		System.out.println("Il tuo saldo e' di: " + denaro.getSoldi() + "$");
		
		do {
			System.out.println("Vuoi continuare a prelevare? Se e' si, digita la somma da prelevare, in caso contrario digita: 0");
			soldiprelevati = input.nextDouble();
			
			if(soldiprelevati!=0) {				
				denaro.Preleva(soldiprelevati);
			}
			
		} while(soldiprelevati != 0);
		
		System.out.println("Il tuo saldo e' di: " + denaro.getSoldi() + "$");
	}

}
