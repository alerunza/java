package ottobre.es26_10_2022;
import java.math.*;

public class SommaPrimaDopo {

	public static void main(String[] args) {
		int[] array = new int[10];
		//int[] array = {8, 0, -4, 11, 5, 9, 4, 6, 2, -8};
		int somma = 0;
		boolean risp = false;
		
		for(int i = 0; i<10; i++) {
			array[i] = (int) (Math.random()*10);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		int j = 0;
		
		for(int i = 1; i<9; i++) {
			somma = array[i-1] + array[i+1];
			//System.out.println(array[i-1] + " | " + array[i+1] + " " + i);
			//System.out.println(somma);
			if(array[i]==somma) {
				//System.out.println(array[i] + " | " + somma + " - OK");
				System.out.print("Pos: " + i + " " + somma + " = " + array[i-1] + " + " + array[i+1] + "\n");
				risp = true;
			}
		}

		if(risp) {
			System.out.print("OK");
		} else {
			System.out.println("NO");
		}
	}	
}