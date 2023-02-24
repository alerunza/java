package febbraio.es24_02_2023;

public class BorsaStudio {
	public String nome, ente;
	public int durata = 0;
	public double rata = 0;
	
	public BorsaStudio(String nome, String ente, int dur, double ratamensile) {
		this.nome = nome;
		this.ente = ente;
		this.durata = dur;
		this.rata = ratamensile;
	}

	public double getRata() {
		return rata;
	}

	public void setRata(double rata) {
		this.rata = rata;
	}

	public String getNome() {
		return nome;
	}

	public String getEnte() {
		return ente;
	}

	public int getDurata() {
		return durata;
	}
	
	public String getBorsaDesc() {
		return "Nome Beneficiario: " + this.nome + "\nEnte: " + this.ente;
	}
}
