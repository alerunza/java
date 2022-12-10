package es4_11_2022;
/**
 * @author EMANUELE DOLCE
 * @version 1.0
 * @category 1
 * @apiNote primi 10 numeri pi� frequenti 1000 numeri tra 0 e 100
 * 
 * **/
import java.math.*;
public class Main1 {
	

	public static void main(String[] args) {
		int [] a= new int[1000];
		int [][] b= new int[100][100];
		int c=0;
		for(int i=0;i<100;i++) {
			b[i][1]=i;
		}
		
		System.out.println("Questi sono i numeri :");
		for(int i=0; i<1000;i++) {
			a[i]=(int) (Math.random()*101);
			
			if(i==c) {
				c+=10;
				System.out.println("");
			}
			
			System.out.print("| "+a[i]+"\t");
			
		}
		System.out.println(" ");
		System.out.println("questo � quanto si ripetono i numeri ('tutti'):");
		for(int i=0; i<100;i++) {
			for(int j=0; j<1000;j++) {
				if(a[j]==i) {
					b[i][0]++;
					
				}
			}
			
			System.out.println("numero : "+i+" , ripetizioni : "+b[i][0]+" ." );
		}
		c=0;
		for(int i = 0 ; i<100;i++) {
			c+=b[i][0];
		}
		System.out.println("verifica del totale: "+c+" .");
		
		System.out.println("i primi 10 sono: ");
		for (int i=0; i<99;i++) {
		c=0;
	
				for(int j=0;j<99;j++) {
					
						if(b[j][0]<b[j+1][0]) {
							c=b[j][0];
							b[j][0]=b[j+1][0];
							b[j+1][0]=c;
							
							c=b[j][1];
							b[j][1]=b[j+1][1];
							b[j+1][1]=c;
						}	
				}
		c=0;
				for(int j=0;j<99;j++) {
				if(b[j][1]>b[j+1][1] && b[j][0]<b[j+1][0]) {
							c=b[j][0];
							b[j][0]=b[j+1][0];
							b[j+1][0]=c;
							
							c=b[j][1];
							b[j][1]=b[j+1][1];
							b[j+1][1]=c;
						
				}
				}
		}	
		for(int i=0;i<10;i++) {
			System.out.println("|"+b[i][0]+" , del numero "+b[i][1]+"|");
		}
	}

}
