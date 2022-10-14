package esercizi14_10_2022;

public class TavolaPitagorica {

	public static void main(String[] args) {
		/* Esercizio 7. Modificare il programma TavolaPitagorica visto a lezione in modo che i valori stampati
		siano ben incolonnati come nel seguente esempio: */

	    int pitagorica[9][9];
	    int i, j;
	    
	    for(i=0; i<9; i++) { 
	        for(j=0; j<9; j++) {
		        pitagorica[i][j]=(i+1)*(j+1);
	        }
	    }

	    for(i=0; i<9; i++) {
	        for(j=0; j<9; j++) {
	            cout<<pitagorica[i][j]<<"\t";
	        }
	        cout<<endl;	
	    }
		
	}

}
