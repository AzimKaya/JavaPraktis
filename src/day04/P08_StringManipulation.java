package day04;

import java.util.Scanner;

public class P08_StringManipulation {
    public static void main(String[] args) {

          Scanner scanner=new Scanner(System.in);
          System.out.println("Adınızı ve soyadınınzı aralarında bosluk olacak sekilde giriniz");
          String name=scanner.nextLine();
          String name2="TARIK YİGİT";

        //if (name==name2){
        //    System.out.println("Dogru giris Yapildi");
        //}else {
        //    System.out.println("Yanlıs giris yapildi");
        //
        //}
        //
       // if (name.equals(name2)){
       //     System.out.println("Dogru giris Yapildi");
       // }else {
       //     System.out.println("Yanlıs giris yapildi");

       // }

        //if (name.equalsIgnoreCase(name2)){
        //          System.out.println("Dogru giris Yapildi");
        //     }else {
        //         System.out.println("Yanlıs giris yapildi");
        //
        //     }

       //String name3= new String ("Tarık Yıgıt");

       //if (name.equals(name3)){
       //    System.out.println("Dogru giris Yapildi");
       //}else {
       //    System.out.println("Yanlıs giris yapildi");

       //}

        System.out.println("Girilen ismin uzunlugu:"+name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,7));



    }
}
