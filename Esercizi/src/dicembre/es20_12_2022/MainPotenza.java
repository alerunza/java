package dicembre.es20_12_2022;

public class MainPotenza {

	public static void main(String[] args) {
		Potenza pot = new Potenza (5);
		
		System.out.println(pot.pow());
		pot.cambiabase(3);
		System.out.println(pot.pow());
	}

}
