package febbraio.es22_02_2023;

public class Main {

	public static void main(String[] args) {
		Aeroporto CT = new Aeroporto("Fontana Rossa", "Catania", "CT");
		System.out.println("Aeroporto: " + CT.getNome() + "\nCitta': " + CT.getCitta() + "\nSigla: " + CT.getSigla());
		
		Passeggero pass = new Passeggero("Alessandro", "Italiana", "AZ2341", "13D", "Vegetariano");
		System.out.println("\nPasseggero: " + pass.getNome() + "\nNazionalita': " + pass.getNazionalita() + "\nSigla Volo: " + pass.getSigla() + "\nCibo Richiesto: " + pass.getCiborichiesto());
		
		int nPass = 4;
        String[] passeggeri =  new String[nPass];
        passeggeri = new String[] {"Ale", "Mich", "Gero"};
        
		Volo volo = new Volo("Catania", "Milano", nPass, passeggeri);
		volo.addPass("Ciao");
		volo.getElencoPass();
	}

}
