package day05_Forloop;

import java.util.Scanner;

public class p06Forloop {
    public static void main(String[] args) {
        //Kullanıcıdan bir string metin isteyin ve stringi tersine cevirip kaydedin ve yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scanner.nextLine();
        String tersMetin="";

        for (int i = metin.length(); i >0 ; i--) {
            tersMetin+=metin.substring(i-1,i);

        }
        metin=tersMetin;
        System.out.println("Girilen metnin tersten yazilisi:"+metin);
    }

}
