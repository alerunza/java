package marzo.es02_03_2023;

public class Studente extends Persona {
private String Matricola, Università;
	public Studente(String codfis, String nome, String cognome,String u, String m) {
		super(codfis, nome, cognome);
		this.setUniversità(u.toLowerCase());
		this.setMatricola(m.toUpperCase());
	}

	public String getMatricola() {
		return Matricola;
	}
	
	public void setMatricola(String matricola) {
		Matricola = matricola;
	}
	
	public String getUniversità() {
		return Università;
	}
	
	public void setUniversità(String università) {
		Università = università;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nUniversità: " + this.Università + "\nMatricola: " + this.Matricola);
	}

}
