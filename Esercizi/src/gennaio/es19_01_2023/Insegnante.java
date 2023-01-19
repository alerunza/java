package gennaio.es19_01_2023;

public class Insegnante extends Persona {

	String materia;
	
	public Insegnante(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}
	
	public void insegnatest() {
		System.out.println("Test Insegnante...");
	}
	
	//override (sovrascrivere)

	@Override
	public void test() {
		System.out.println("Test Insegnante:" + " " + nome + " - " + cognome);
	}
}
