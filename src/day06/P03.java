package day06;

public class P03 {
    public static void main(String[] args) {
        //2 Basamaklı 7 ile bolunebilen pozitif tam sayilari while loop ile yazınız .

        int sayi=10;
        String sayilar="";

        while (sayi<200){
            if (sayi%7==0){
                sayilar+=sayi+",";

            }
            sayi++;
        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));
    }
}
