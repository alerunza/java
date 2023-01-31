package gennaio.es31_01_2023;

public class MainInsegnamenti {

	public static void main(String[] args) {
		Studente stu = new Studente("Alessandro", "Runza", 4, "Informatica");
		System.out.println("Dati Studente");
		stu.stampaDati();
		
		System.out.println();
		
		int nClassi = 3;
		String[] classi =  new String[nClassi];
		classi = new String[] {"3° B", "4° B", "5° B"};
		
		Insegnante teach = new Insegnante("Matt", "Kirby", nClassi, classi);
		
		System.out.println("Dati Insegnante");
		teach.stampaDati();
	}

}
