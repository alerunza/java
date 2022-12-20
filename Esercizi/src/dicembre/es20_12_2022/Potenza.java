package dicembre.es20_12_2022;

public class Potenza {
	private int n;
	
	public Potenza (int n) {
		this.n = n;
	}
	
	public int pow() {
		int pow = 0;
		
		pow = n * n;
		
		return pow;
	}
	
	public void cambiabase(int n) {
		this.n = n;
	}
}