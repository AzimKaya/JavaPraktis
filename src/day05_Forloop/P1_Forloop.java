package day05_Forloop;

import java.util.Scanner;

public class P1_Forloop {
    public static void main(String[] args) {

      /*
SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int girilenSayi =scanner.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {

            if (i%7==0){
                System.out.print(i+ "-");
            }

        }
        System.err.print("==============İslem Tamamalandi===============");

    }
}
