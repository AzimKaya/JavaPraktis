package day05_Forloop;

import java.util.Scanner;

public class p05_Forloop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 0; i <5 ; i++) {
            System.out.print(i+1 + ".sayiyi giriniz: ");
            sayi=scanner.nextInt();
            if (sayi>=5 && sayi<=10){
                continue;
            }
            
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
