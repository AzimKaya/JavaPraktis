package day03_DataCasting;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {
       // 1-Double olarak verilen 3 sayının toplamını int olarak yazdırın
        // ipucu: double>float>long>int>short>byte

        double a=3,b=7,c=3.12;

        int toplam=(int) (a+b+c);

        System.out.println("toplam="+toplam);


       // System.out.println("a="+a);

        /*
         2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
          Girdiğiniz harf :
          Girdiğiniz harften sonraki  3 harf :
          şeklinde yazdırın.
          ipucu: char
        */

        Scanner wq=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz:  ");
        char harf=wq.next().charAt(0);
        System.out.print("Girdiginiz harf :  "+harf);
        System.out.print("Girdiginiz harften sonraki 3 harf:  "+(char)(harf+1)+","+(harf+2)+(harf+3)+"'dir");




    }
}
