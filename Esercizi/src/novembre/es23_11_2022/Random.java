package novembre.es23_11_2022;

public class Random {
	public Random () {

	}
	
	public int Genera () {
		int rand = 0;
		
		rand = (int) (Math.random()*6+1);
		
		return rand;
	}
}
