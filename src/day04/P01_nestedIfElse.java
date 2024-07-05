package day04;

import java.util.Scanner;

public class P01_nestedIfElse {

    public static void main(String[] args) {
/*
1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
   Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
   KURALLAR
     : 1999 yılı 9. ay öncesi işe başlamış olmak
     : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
     : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
 */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ise giris tarihinizi yil ve ay olarak 1999.09");
        double giris =scanner.nextDouble();

        if (giris>1999.09){
            System.out.println("EYT Kanun duzenlemesine tabi degilsiniz ");
        }else {
            System.out.print("Lutfen cinsiyetinizi K veya E olarak giriniz");
            char cinsiyet=scanner.next().charAt(0);
            System.out.print("Lutfen prim ödeme gun sayisini giriniz");
            int primGun=scanner.nextInt();
            System.out.print("Lutfen hizmet yılını giriniz");
            int himetSuresi=scanner.nextInt();

            if (cinsiyet=='E'|| cinsiyet=='e'){
                if (primGun>=5500 && himetSuresi>=25){
                    System.out.println("Kanun yururluge girdigi tarihte emekli olabilirsiniz");
                } else if (primGun<5500 && himetSuresi>=25) {
                    System.out.println("Emekli olabilmek icin :"+(5500-primGun)+"gun prim ödemelisiniz");
                } else if (primGun>=5500 && himetSuresi<25) {
                    System.out.println("Emekli olabilmek icin :"+(25-himetSuresi)+"yıl daha calısmalısınız");

                }else {
                    System.out.println("Maalesef henuz EYT ikisini de saglamamıyorsunuz");
                    System.out.println("Calısma suresi Eksigi: "+(25-himetSuresi)+"yıl");
                    System.out.println("Eksik prim gun sayisi:"+(5500-primGun)+"gun");
                }


                if (cinsiyet=='K'|| cinsiyet=='k'){
                    if (primGun>=5000 && himetSuresi>=20){
                        System.out.println("Kanun yururluge girdigi tarihte emekli olabilirsiniz");
                    } else if (primGun<5000 && himetSuresi>=20) {
                        System.out.println("Emekli olabilmek icin :"+(5000-primGun)+"gun prim ödemelisiniz");
                    } else if (primGun>=5000 && himetSuresi<20) {
                        System.out.println("Emekli olabilmek icin :"+(20-himetSuresi)+"yıl daha calısmalısınız");
                    }else {
                        System.out.println("Maalesef henuz EYT ikisini de saglamamıyorsunuz");
                        System.out.println("Calısma suresi Eksigi: "+(20-himetSuresi));
                        System.out.println("Eksik prim gun sayisi:"+(5000-primGun));
                    }

                }else {
                    System.out.println("Yanlıs bir deger girdiniz");
                }


            }



        }

    }
}
