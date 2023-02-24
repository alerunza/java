package febbraio.es24_02_2023;

public class AssegnoRicerca extends BorsaStudio{
	public String tematica, dipartimento;
	
	public AssegnoRicerca(String nome, String ente, int dur, double ratamensile, String tema, String dep) {
		super(nome, ente, dur, ratamensile);
		this.tematica = tema;
		this.dipartimento = dep;
	}

	public String getTematica() {
		return tematica;
	}

	public String getDipartimento() {
		return dipartimento;
	}

	public String getAssegnoRicerca() {
		return "Assegno di Ricerca dell'ente: " + super.getEnte() + "\nTematica: " + this.tematica + "\nDipartimento Richiedente: " + this.dipartimento; 
	}
	
	public boolean checkDep(String dep) {
		if(!(this.dipartimento.contains(dep))) {
			return false;
		} else {
			return true;
		}
	}
}
