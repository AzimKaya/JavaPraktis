package day05_Forloop;

import java.util.Scanner;

public class P02_Forloop {
    public static void main(String[] args) {
        /*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen  baslangıc degeri pozitif bir tamsayi giriniz");
        int basDegeri= scanner.nextInt();
        System.out.println("Lutfen  bitis degeri pozitif bir tamsayi giriniz");
        int bitDegeri= scanner.nextInt();
        int toplam=0;

        if (bitDegeri<basDegeri){
            System.out.println("=========Baslangıc degeri bitis degerinden buyuk olamaz====");
        }else {
            for (int i = basDegeri; i <=bitDegeri ; i++) {
                toplam+=i;

            }
            System.out.println("Girdiginiz aralıktaki sayilarin toplami = " + toplam);
        }
















    }
}
