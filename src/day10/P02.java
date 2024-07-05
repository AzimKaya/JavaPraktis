package day10;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        /*
    MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
    Mountain array ==> [0,2,5,3,1]
    Bir array elemanları en büyük değerine kadar sürekli artan,
    en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
    Mountain array değildir ==>[5,2,7,1,4]
      */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Montain Array kontrolu icin array elemenı sayilari aralarına virgul koyarak giriniz");
        String str=scanner.next();
        String strArr[]=str.split(", ");

        int Arr [] = new int[strArr.length];

        for (int i = 0; i <strArr.length ; i++) {
            Arr [i] =Integer.parseInt(strArr [i]);

        }
     boolean isMontain=montainArrControl(Arr);
        if (isMontain){
            System.out.println("Array montain araydir");
        }else {
            System.out.println("Array montain degildir");
        }
    }
    private static boolean montainArrControl(int [] Arr ) {

        if (Arr.length<3){
            return false;

        }
        int enBuyuk=0;

        for (int i = 0; i <Arr.length-1 ; i++) {

            if (Arr [i]<Arr [i+1]){

            }else {
                break;
            }

        }

       if (enBuyuk==Arr [0] || enBuyuk==Arr.length-1){

           return false;

       }
        for (int i = enBuyuk; i <Arr.length-1 ; i++) {

            if (Arr [i]>Arr [i+1]){

                enBuyuk=Arr[i+1];
            }else {
                break;
            }
        }
       return  true;
    }
}
