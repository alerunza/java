package gennaio.es19_01_2023;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Matt", "Kirby");
		p1.test();
		
		Studente s1 = new Studente("Mich", "Turkish", "4B");
		s1.test();
		System.out.println(s1.classe);
//		System.out.println(s1.cognome);
		
		Insegnante i1 = new Insegnante("Stefano", "Tarallo", "Filosofia");
		i1.test();
		System.out.println(i1.materia);
	}

}
