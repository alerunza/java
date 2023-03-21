package marzo.es21_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rettangolo rett = new Rettangolo(3, 2);

        System.out.println("Rettangolo: " + rett.getArea());

        Parallelepipedo par = new Parallelepipedo(3, 2, 5);

        System.out.println("Parallelepipedo: " + par.getVolume());
    }
}
