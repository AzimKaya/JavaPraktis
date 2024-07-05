package day04;

import java.util.Scanner;

public class P02_nestedIfElse {

    public static void main(String[] args) {
          /*
 2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urun adetini giriniz");
        int adet =scanner.nextInt();
        System.out.println("urun liste fiyatı:");
        double fiyat=scanner.nextDouble();

        System.out.println("T127 kart kullanıyor musunuz:E/H");
        char kart =scanner.next().charAt(0);

        if (kart=='E' || kart=='e'){
            if (adet>10){
                System.out.println("%20 Musteri indirimli fiyatınız toplam Tutar:"+((adet*fiyat)*(0.8)));
            }else {
                System.out.println("%15 Musteri indirimli fiyatınız toplam Tutar:"+((adet*fiyat)*(0.85)));
            }


        } else if (kart=='H'|| kart=='h') {
            if (adet>10){
                System.out.println("%15 Musteri indirimli fiyatınız toplam Tutar:"+((adet*fiyat)*(0.85)));
            }else {
                System.out.println("%10 Musteri indirimli fiyatınız toplam Tutar:"+((adet*fiyat)*(0.9)));
            }

        }




    }
}
