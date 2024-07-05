package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        //Girilen desimal (10Luk tabanda ) degeri binary (2Lik sayi duzeni )degere çevrilen metodu olustururnuz.
        //Ornek:12=1 1 0 0

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir desimal sayi giriniz: ");
        int sayi=scanner.nextInt();
        System.out.println(sayi+" Degerini binary karsılıgı"+ binaryDonusum(sayi));
    }
    private static ArrayList<Integer> binaryDonusum( int sayi) {

        ArrayList<Integer>binary=new ArrayList<>();
        while (sayi>=1){
         binary.add(sayi%2);//sayiyi 2'ye bolup kalanını ekleyecek
         sayi/=2;   //sayi=sayi/2

        }
        Collections.reverse(binary);
        return  binary;

    }
}
