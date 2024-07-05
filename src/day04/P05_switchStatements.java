package day04;

import java.util.Scanner;

public class P05_switchStatements {
    public static void main(String[] args) {

// Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz.(0-9 arasinda )");
        int rakam =scanner.nextInt();

        switch (rakam){

            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Rakam 0-9 arasinda olabilir.Yanlis bir deger girdiniz");


        }


    }


}
