package dey07;

public class P02_Scope {
    public static void main(String[] args) {
        System.out.println(P01.kutle);
        System.out.println(P01.yas);
        //System.out.println(P01.isim);P01 Class'ndaki verilerden sadece static 0lanlara ulasabiliriz.

        P01 obje=new P01();
        System.out.println(P01.yas);
        System.out.println(obje.isim);
        System.out.println(obje.soyisim);

        obje.isim="Azim";
        obje.soyisim="Kaya";
        System.out.println(obje.soyisim);

        P01 obje2=new P01();
        obje.isim="Ali";
        System.out.println(obje2.isim);
        System.out.println(obje.isim);

        System.out.println(P01.kutle2);

        P01 obje3=new P01();
        obje3.isim="Tas";
        obje3.soyisim="Toprak";
        System.out.println(obje3.isim);
        System.out.println(obje3.soyisim);



    }
}
