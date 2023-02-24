package febbraio.es22_02_2023;

public class Volo {
	public int maxPass = 0, Pass = 0;
	public String[] passeggeri = new String[maxPass];
	
	public String AEpart, AEdest;
	
	public Volo(String partenza, String destinazione, int nPass, String[] passeggeri) {
		this.AEpart = partenza;
		this.AEdest = destinazione;
		
		this.maxPass = nPass;
		this.passeggeri = passeggeri;
	}

	public void addPass(String nome) {
		for(int i = 0; i < maxPass; i++) {
			if(!this.passeggeri[i].contains("")) {
				this.Pass++;
			}
		}
		
		if(this.Pass < maxPass) {
			System.out.println("Limite raggiunto dei Passeggeri");
		} else {
			this.Pass++;
			this.passeggeri[this.Pass] = nome;
		}
	}
	
	public void getElencoPass() {
		for(int i = 0; i < 4; i++) {
			System.out.println(passeggeri[i]);
		}
	}

}
