package gennaio.es31_01_2023;

public class Studente extends Persona {
	private int anno; //anno di appartenenza
	private String materiaPref;  //materia preferita
	
	
	public Studente(String nome, String cognome, int anno, String mat) {
		super(nome, cognome);
		this.anno = anno;
		this.materiaPref = mat;
	}

	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}


	public String getMateriaPref() {
		return materiaPref;
	}


	public void setMateriaPref(String materiaPref) {
		this.materiaPref = materiaPref;
	}
	
	@Override
	public void stampaDati() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
		System.out.println("Anno: " + this.anno);
		System.out.println("Materia Preferita: " + this.materiaPref);
	}
}
