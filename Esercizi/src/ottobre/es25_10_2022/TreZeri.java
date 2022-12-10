package es25_10_2022;
import java.util.Scanner;

public class TreZeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int zero = 0, somma = 0;
		while(zero!=3) {
			int n = input.nextInt();
			if(n==0) {
				zero++;
			} else {
				zero = 0;
			}
			somma+=n;
		}
		System.out.println("La somma è: " + somma);

	}

}
