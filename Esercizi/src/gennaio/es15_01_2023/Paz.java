package gennaio.es15_01_2023;

public class Paz {
	public int n = 20;
	private String[] pazienti = new String[n];
	
	public Paz() {
		this.n = 0;
		this.pazienti[n] = "";
//		for(int i = 0; i < n; i++){			
//			pazienti[i] = "";
//		}
	}
	
	public void insPaz(String nompaz) {
		this.pazienti[this.n] = nompaz;
		this.n++;
	}
	
	public void delPaz(String nompaz) {
		for(int i = 0; i < this.n; i++) {
			if(this.pazienti[i] == nompaz) {
				this.pazienti[i] = "";
				
			}
			for(int j = i+1; j < this.n; j++) {
				if(this.pazienti[i] == "") {
					String temp = this.pazienti[i];
					this.pazienti[i] = this.pazienti[j];
					this.pazienti[j] = temp;
				}
			}
		}
	}
	
	public void listPaz () {
		System.out.println("Lista Pazienti: ");
		for(int i = 0; i < this.n; i++) {	
			System.out.println(this.pazienti[i]);
		}
	}
	
	public void stampaPaz(String nompaz) {
		for(int i = 0; i < this.n; i++) {
			if(nompaz == this.pazienti[i]) {
				System.out.println(nompaz + " - Posizione: " + (i+1));
			}
		}
	}
	
}
