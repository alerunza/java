package febbraio.es02_02_2023;

public class Lavoratore {
	public String Nome;
	public int Livello = 0;
	public int Stipendio = 0;
	
	public Lavoratore(String nome, int livello, int stipendio) {
		this.Nome = nome;
		this.Livello = livello;
		this.Stipendio = stipendio;
	}
	
	public void stampaStipendio() {
		System.out.println("Nome Lavoratore: " + this.Nome + "\nStipendio di " + this.Nome + " e': " + this.Stipendio);
	}
}
