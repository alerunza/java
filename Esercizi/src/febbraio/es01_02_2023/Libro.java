package febbraio.es01_02_2023;

public class Libro {
	public int numPagine = 0;
	
	public Libro(int num) {
		this.numPagine = num;
	}
	
	public void pageMessage() {
		System.out.println("Numero di Pagine: " + this.numPagine);
	}
}
