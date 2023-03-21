package marzo.es21_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("Inserisci due numeri");

        a = input.nextDouble();
        b = input.nextDouble();

        System.out.println("Risultato: " + (a + b));
    }
}
