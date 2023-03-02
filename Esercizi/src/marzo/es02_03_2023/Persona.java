package marzo.es02_03_2023;

public class Persona {
	public String CodiceFiscale, Nome, Cognome;
	
	public Persona(String codfis, String nome, String cognome) {
		this.CodiceFiscale = codfis.toUpperCase();
		this.Nome = nome.toLowerCase();
		this.Cognome = cognome.toLowerCase();
	}

	public String getCodiceFiscale() {
		return CodiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	public String toString() {
		return ("Codice Fiscale: " + this.CodiceFiscale + "\nNome: " + this.Nome + "\nCognome: " + this.Cognome);
	}
}
