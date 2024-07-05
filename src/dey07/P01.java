package dey07;

public class P01 {

    String isim="Murat";String soyisim="Bababayigit";
     static int yas=43;

    static double kutle=77.4;
    static double kutle2=85.7;

    public static void main(String[] args){

        System.out.println(kutle);
        System.out.println(yas);
    }

    public void statikOlmayan(){

        System.out.println(kutle);
        System.out.println(yas);
        System.out.println(isim);
    }
}
