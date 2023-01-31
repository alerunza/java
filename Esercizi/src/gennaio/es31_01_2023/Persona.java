package gennaio.es31_01_2023;

public class Persona {
	public String nome, cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void stampaDati() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
	}
}
