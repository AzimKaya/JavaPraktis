package day03_DataCasting;

import java.util.Scanner;

public class C04_ifElse_Emekli {
    public static void main(String[] args) {


        /*
             2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
         yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
         olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.


          */


        Scanner scanner=new Scanner(System.in);
        System.out.println( " Lutfen cinsiyetinizi E veya K olarak giriniz");

        char cinsiyet =scanner.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");

        int yas =scanner.nextInt();

        if ((cinsiyet=='K' || cinsiyet=='k' ) && yas>=60){
            System.out.println("Emekli olabilirsiniz");

        }if ((cinsiyet=='K' || cinsiyet=='k' ) && yas<60){
            System.out.println("Emekli olmak icin "+ (60-yas )+" yıl calısmalisiniz");

        }if ((cinsiyet=='E' || cinsiyet=='e') && yas>=65){
            System.out.println("Emekli olabilirsiniz");

        }if ((cinsiyet=='E' || cinsiyet=='e') && yas<65){
            System.out.println("Emekli olmak icin "+ (65-yas )+" yıl calısmalisiniz");

        }else {
            System.out.println("Girdiginiz degerlerden en az biri yanlıstır");
        }

    }
}
