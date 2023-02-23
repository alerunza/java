package gennaio.es31_01_2023;

public class Insegnante extends Persona {
	public int nClassi = 0;
	private String[] classi = new String[nClassi];
	
	public Insegnante(String nome, String cognome, int nClassi, String[] classi) {
		super(nome, cognome);
		this.nClassi = nClassi;
		this.classi = classi;
	}

	public int getnClassi() {
		return nClassi;
	}

	public void setnClassi(int nClassi) {
		this.nClassi = nClassi;
	}

	public String[] getClassi() {
		return classi;
	}

	public void setClassi(String[] classi) {
		this.classi = classi;
	}
	
	@Override
	public void stampaDati() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
		System.out.println("Numero di Classi: " + this.nClassi);
		if(this.nClassi > 1) {			
			for(int i = 0; i < this.nClassi; i++) {
				System.out.println("Classi: " + this.classi[i]);
			}
		} else {
			System.out.println("Classe: " + this.classi[0]);
		}
	}
}
