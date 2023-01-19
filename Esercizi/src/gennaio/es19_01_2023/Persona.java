package gennaio.es19_01_2023;

public class Persona {
	String nome, cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void test() {
		System.out.println("Test:" + " " + nome + " - " + cognome);
	}
}
