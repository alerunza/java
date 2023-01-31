package gennaio.es31_01_2023;

public class Cerchio {
	public double raggio;
	
	public Cerchio(double r) {
		this.raggio = r;
	}
	
	public void setRaggio(double r) {
		this.raggio = r;
	}
	
	public double Circonferenza() {
		return 2 * Math.PI * this.raggio;
	}
	
	public double Area() {
		return this.raggio * this.raggio * Math.PI;
	}
}
