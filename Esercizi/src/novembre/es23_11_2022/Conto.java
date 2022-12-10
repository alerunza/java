package novembre.es23_11_2022;

public class Conto {
	private double soldi;
	
	public Conto (double soldi) {
		this.soldi = soldi;
	}
	
	public void Preleva(double soldipre) {
		double op = 0;
		
		op = soldipre - soldi;
		
		if(op<0) {
			op = op * -1;
		}
		
		soldi = op;
		
		System.out.println("Soldi Prelevati: " + op + "$");
	}

	public void setSoldi(double soldi) {
		this.soldi = soldi;
	}

	public double getSoldi() {
		return soldi;
	}
	
}
