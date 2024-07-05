package day04;

import java.util.Scanner;

public class P07_SwittchStatemennts {
    public static void main(String[] args) {


/*
Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bilgi istediginiz yılı giriniz");
        int year=scanner.nextInt();
        System.out.println("Gun sayısını aradıgınız ayin numarasını giriniz");
        int numMonth=scanner.nextInt();
        int numdays;
        switch (numMonth){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numdays=31;
                System.out.println("Girdiginiz ayadaki gun sayisi:31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                numdays=30;
                System.out.println("Girdiğiniz aydaki gün sayisi:"+numdays);
                 break;

            case 2:
                numdays=(year%4==0 && !(year%100==0) || year%400==0)?29:28;
                System.out.println("Girdiğiniz aydaki gün sayisi:"+numdays);
                break;
            default:
                System.out.println("Gecersiz bir ay numarasi girdiniz.Miladi takvimde 12 Ay vardir");



        }



    }
}
