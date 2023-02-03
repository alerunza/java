package febbraio.es02_02_2023;

public class LavoratoreConStraordinariPagati extends Lavoratore {
	public int oreStraordinario = 0;
	public final int retribuzioneOraria = 10;
	
	public LavoratoreConStraordinariPagati(String nome, int livello, int stipendio, int ore) {
		super(nome, livello, stipendio);
		this.oreStraordinario = ore;
	}
	
	public void stampaStraordinari() {
		System.out.println("Ore di Straordinario di " + this.Nome + " e': " + this.oreStraordinario);
	}
	
	@Override
	public void stampaStipendio() {
		System.out.println("Nome Lavoratore: " + this.Nome + "\nStipendio con Ore di Straordinario di " + this.Nome + " e': " + (this.Stipendio + (this.oreStraordinario * retribuzioneOraria)));
	}

}
