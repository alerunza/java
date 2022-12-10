package es16_11_2022;

public class Anagrafica {
	public String nome, cognome;
	private String email;
	public boolean registrata = false;
	
	public Anagrafica(String nome, String cognome, String email){
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	public void registraMail() {
		if(email.contains("@")) {
			registrata = true;
		} else {
			registrata = false;
		}
	}
	
	public void stampaDati() {
		System.out.println("NOME: " + nome + "\nCOGNOME: " + cognome);
		if(registrata) {
			System.out.println("EMAIL: " + email);
		} else {
			System.out.println("EMAIL: non registrata");
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setMail(String email) {
		this.email = email;
	}
}
