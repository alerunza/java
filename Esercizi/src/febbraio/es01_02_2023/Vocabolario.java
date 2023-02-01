package febbraio.es01_02_2023;

public class Vocabolario extends Libro {
	public int numDefinizioni = 0;
	
	public Vocabolario(int num, int definizioni) {
		super(num);
		this.numDefinizioni = definizioni;
	}

	public void definitionMessage() {
		double mediaDef = 0;
		mediaDef = this.numDefinizioni / this.numPagine;
		System.out.println("Numero di Pagine: " + this.numPagine + "\nNumero di Definizioni: " + this.numDefinizioni + "\nMedia di Definizioni per Pagina: " + mediaDef);
	}
}
