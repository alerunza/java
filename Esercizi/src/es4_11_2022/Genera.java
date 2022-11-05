package es4_11_2022;
import java.util.*;

public class Genera {

	public static void main(String[] args) {
		int[] array = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			array[i] = (int) (Math.random()*101);
		}
		
		for(int i = 0; i < 1000; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println();
		
		int x = 0;
		int[] conta = new int[101];
		int[] classifica = new int[101];
		
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < 101; j++) {
				if(array[i]==j) {
					conta[j]++;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			System.out.println("NUMERO: " + i + " x " + conta[i]);
		}
		
		x = conta[0];
		
		for(int i = 0; i < 101; i++) {
			if(i>=1) {
				if(conta[i]>x) {
					x = conta[i];
				}	
			}
		}
		
		for(int i = 0; i < 101; i++) {
			classifica[i] = i;
		}
		
		int num = 0;
		for(int j = 0; j < 100; j++) {
			for(int i = 0; i < 100; i++) {
				if(conta[i]<conta[i+1]) {
					num = conta[i];
					conta[i] = conta[i+1];
					conta[i+1] = num; // sposterà di una posizione fin tanto che non si ripeterà di nuovo andando a trovare la sua posizione
					
					num = classifica[i];
					classifica[i] = classifica[i+1];
					classifica[i+1] = num; // sposterà nella sua posizione
				}
			}
		}
		
		//una volta che li ha spostati in maniera decrescente, il for li stamperà in maniera crescente
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + "° Posto - " + classifica[i] + " x " + conta[i]);
		}
	}
}