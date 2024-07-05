package day02;

import java.util.Scanner;

public class p03_scanner {
    public static void main(String[] args) {

        //Bazen kod yazarken bazı variablelar için kullnıcıdan değer almak gerekir
        //Bu gibi durumlarda Sccanner classından faydalanılır.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Adinizi Giriniz");
        String name = scanner.nextLine();
        System.out.print("Lutfen Soyadinizi giriniz");
        String surname=scanner.nextLine();

        System.out.println("Adiniz:"+name+" "+surname+ " olarak kaydedildi");

    }
}
