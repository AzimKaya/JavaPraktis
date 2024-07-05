package day03_DataCasting;

import java.util.Scanner;

public class C02İfStatements {
    public static void main(String[] args) {

        /*
1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
*** String icin equals method'unusalı kullanin
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun: ");
        String gun = scanner.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("Sali") || gun.equals("Carsamba") || gun.equals("persembe") || gun.equals("Cuma")) {
            System.out.println("Bugun Hafta ici bir gun");

        }
        if (gun.equals("Cumartesi") || gun.equals("Pazar")) {
            System.out.println("Bugun Haftasonu bir gun");

        }
        if (!(gun.equals("pazartesi") || gun.equals("Sali") || gun.equals("Carsamba") || gun.equals("persembe") || gun.equals("Cuma")
                || gun.equals("Cumaertesi") || gun.equals("Pazar"))) {

            System.out.println("Bugun Hafta ici bir gun");


        }

    }

}

