package day09;

import java.util.ArrayList;
import java.util.List;

public class p01 {

   /*
Verilen String bir array'deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin.
 */

    public static void main(String[] args) {


        String[] isimler={"ayça","fikret","esrayilmaz","azim","humeyra","suleyman","beytullah"};

        List<String>yeniList=new ArrayList<>();
        for (String each:isimler) {

           if (each.length()%2==0){
               yeniList.add(each.substring(0,each.length()/2));
           }else {
               yeniList.add(each.substring(each.length()-1/2));
           }
        }
        System.out.println(yeniList);


    }
}
