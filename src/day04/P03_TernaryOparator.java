package day04;

import java.util.Scanner;

public class P03_TernaryOparator {
    public static void main(String[] args) {

        /*
      1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
          "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        System.out.print("1.Kenar");
        double kenar1=scanner.nextDouble();

        System.out.print("2.Kenar");
        double kenar2=scanner.nextDouble();

        System.out.print("3.Kenar");
        double kenar3=scanner.nextDouble();

        // ?__ise

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ?
                kenar1==kenar2 && kenar2 ==kenar3 ? "Ucgen Eskenar ucgendir"
                :"Ucgen eskenar ucgen degildir."
                :"Yanlıs deger girdiniz.");


    }
}
