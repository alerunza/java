package febbraio.es01_02_2023;

public class MainLibro {

	public static void main(String[] args) {
		Libro lib = new Libro(500);
		lib.pageMessage();
		
		System.out.println("\nVocabolario:");
		Vocabolario voc = new Vocabolario(500, 80000);
		
		voc.definitionMessage();
		
	}

}
