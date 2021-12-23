package pl.akademia108;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Wprowadz kurs dolara:");
            Scanner scanner = new Scanner(System.in);

            String kurs1 = scanner.next();
            Double kurs2 = Double.parseDouble(kurs1);
            scanner.close();

            Double kurs3 = kurs2 * 100;

        System.out.println("Zmienna 1:" + kurs2);
        System.out.println("Zmienna 2:" + kurs3);
    }
}
