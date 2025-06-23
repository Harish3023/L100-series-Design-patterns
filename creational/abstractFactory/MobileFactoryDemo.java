package creational.abstractFactory;

import java.util.Scanner;

public class MobileFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile brand (apple/samsung):");
        String choice = scanner.nextLine().toLowerCase();

        MobileFactory factory = null;

        if ("apple".equals(choice)) {
            factory = new AppleFactory();
        } else if ("samsung".equals(choice)) {
            factory = new SamsungFactory();
        } else {
            System.out.println(" Invalid brand selected!");
            System.exit(0);
        }

        // Client uses only the abstract factory interface
        Mobile mobile = new Mobile(factory);
        mobile.assemble();
    }
}