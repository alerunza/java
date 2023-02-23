package febbraio.es22_02_2023;

public class Aeroporto {
	public String nome, citta, sigla;
	
	public Aeroporto(String nome, String citta, String sigla) {
		this.nome = nome;
		this.citta = citta;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getCitta() {
		return citta;
	}

	public String getSigla() {
		return sigla;
	}

}