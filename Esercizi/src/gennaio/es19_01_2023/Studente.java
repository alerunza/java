package gennaio.es19_01_2023;

public class Studente extends Persona {

	String classe;
	
	public Studente(String nome, String cognome, String classe) {
		super(nome, cognome);
		this.classe = classe;
	}
	
	public void studentetest() {
		System.out.println("Test Studente...");
	}
	
	//override (sovrascrivere)
	
	@Override
	public void test() {
		System.out.println("Test Studente:" + " " + nome + " - " + cognome);
	}
}
