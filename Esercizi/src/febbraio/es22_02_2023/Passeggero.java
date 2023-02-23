package febbraio.es22_02_2023;

public class Passeggero {
	public String nome, nazionalita, sigla, posto, ciborichiesto;
	
	public Passeggero(String nome, String nazionalita, String sigla, String cibo, String posto) {
		this.nome = nome;
		this.nazionalita = nazionalita;
		this.sigla = sigla;
		this.posto = posto;
		this.ciborichiesto = cibo;
	}

	public String getPosto() {
		return posto;
	}

	public String getNome() {
		return nome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public String getSigla() {
		return sigla;
	}

	public String getCiborichiesto() {
		return ciborichiesto;
	}
	
	public void setPosto(String posto) {
		this.posto = posto;
	}
}
