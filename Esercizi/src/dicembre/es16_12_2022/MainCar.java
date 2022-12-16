package dicembre.es16_12_2022;

public class MainCar {

	public static void main(String[] args) {
		Car cvpi = new Car(15, 5);
		
		cvpi.Drive(60);
		System.out.println(cvpi.getCarburante());
		cvpi.addGas(20);
		cvpi.Drive(120);
		System.out.println(cvpi.getCarburante());
	}

}
