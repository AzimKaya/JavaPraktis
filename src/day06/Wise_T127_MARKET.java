package day06;


import java.time.LocalDateTime;
import java.util.Scanner;

public class Wise_T127_MARKET {

    static Scanner scanner=new Scanner(System.in);
    static String urunAdi;

    static int urunKodu;

    static double urunFiyati;

    static int urunMiktari;

    static double toplam;

    static String sepet="";

    static boolean ekurun=false;

    public static void main(String[] args) {
//============================Wise T127 MARKET========================
//ilk programa girildiginde bizi bir menu karsilasin bu secenekler
//  1 MANAVÜRÜNLERİ
//  2 ŞARKÜTERİ ÜRÜNLERİ
//  3 MARKET ÜRÜNLERİ
//  secime gore ,
//  4-urunleri listele
//  5-fiyatlari gelsin
//  6-sonunda fis yazdırsın
//    */

        girisEkrani();
    }
    private static void girisEkrani(){

        System.out.println("==========================Wise T127 MARKET====================");
        System.out.println("===========================HOS GELDİNİZ========================");
        System.out.println("Lutfen yapmak istedidiginiz islemi seciniz!");
        System.out.println(" Manav urunleri icin 1\n Sarkuteri urunleri icin 2\n Market urunleri icin 3\n Fis yazdırmak için 4\n Cıkıs yapmak icin 5");

        int secim =scanner.nextInt();

        if (!(secim>=1 && secim<=5)){
            System.out.println("Yanlıs  bir giris yaptıınz.Tekrar deneyiniz");
            girisEkrani();

        }else {
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikıs();
                    break;

            }

        }
    }

    private static void cikıs() {
        System.out.println("--------Wise T127 Market---------");
    }

    private static void fisYazdir() {

        System.out.println("--------Wise T127 Market---------");
        System.out.println("Alışverişinizde bizi tercih ettiğininiz için\nTesekkur ederiz");
        System.out.println(sepet);
        System.out.println(" ");
        System.out.println("Toplam Alısveris tutarı:"+toplam);
        System.out.println("Mmusterinin odeme miktarını ngiriniz");
        int odeme=scanner.nextInt();
        if (odeme<toplam){
            System.out.println("Ödeme yetersiz, odemeniz"+(toplam-odeme)+"kadar eksiktir.Bu fark hesabınıza borc kaydedilmiştir");
        }else {
            System.out.println("Odenen tutar:"+odeme+
                    "\npara ustu:"+(odeme-toplam));
        }
        LocalDateTime saat=LocalDateTime.now();
        System.out.println(saat);
        System.out.println("İyi gunler dileriz -Yine bekleriz ");
        cikıs();

    }

    private static void market() {
        System.out.println("--------Market Reyonuna Hos Geldiniz---------");
        System.out.println("Lutfen almak istediğiniz urunun kodunu(UK) giriniz!");
        System.out.println("Ekmek fiyati:10₺ UK:31 \n Biryag Beş litre aycicek yagı  fiyatı:200₺ UK:32 \n Filiz Makarna :20₺ UK:33 \n Un  fiyatı:80₺ UK34 \n Elsabunu fiyatı:45₺ UK35\n Şampuan  fiyatı:80₺ UK36 ");
        while (!ekurun){

            urunKodu=scanner.nextInt();
            if (urunKodu>=31 && urunKodu<=37){
                System.out.println("Ne kadar(kg/lt/koli) alacaksınız:");
                urunMiktari=scanner.nextInt();
                switch (urunKodu){
                    case 31:
                        urunAdi="Ekmek";
                        urunFiyati=10;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 32:
                        urunAdi=" Biryag yçicek yagı 5 litre ";
                        urunFiyati=200;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 33:
                        urunAdi="Filiz makarna";
                        urunFiyati=20;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 34:
                        urunAdi="Un";
                        urunFiyati=80;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 35:
                        urunAdi="El sabunu";
                        urunFiyati=45;
                        System.out.println(urunMiktari+"Adet"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    case 36:
                        urunAdi="Şampuan ";
                        urunFiyati=80;
                        System.out.println(urunMiktari+"Adet"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    case 37:
                        cikıs();
                        break;
                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Olusan sepet tutarı:"+toplam);
                sepet+=urunAdi+"fiyatı:"+urunFiyati+"₺";
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz\n Ana menuye donmek icin 0'a basınız ");
            }else if(urunKodu==0){
                girisEkrani();

            }
        }
    }

    private static void sarkuteri() {
        System.out.println("--------Sarkuteri Reyonuna Hos Geldiniz---------");
        System.out.println("Lutfen almak istediğiniz urunun kodunu(UK) giriniz!");
        System.out.println("Kaymak fiyati:250₺ UK:22 \n Kasar peyniri fiyatı:200₺ UK:23 \n Yogurt :20₺ UK:24 \n Tereyagı fiyatı:250₺ UK24 \n Sut fiyatı:25₺ UK25\n Ezine peyniri fiyatı:250₺ UK26 ");

        while (!ekurun) {

            urunKodu = scanner.nextInt();
            if (urunKodu >= 22 && urunKodu <= 26) {
                System.out.println("Kac kg alacaksınız:");
                urunMiktari = scanner.nextInt();
                switch (urunKodu) {
                    case 22:
                        urunAdi = "Kaymak";
                        urunFiyati = 250;
                        System.out.println(urunMiktari + "kg" + "fiyati:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 23:
                        urunAdi = "Kasar peyniri";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + "kg" + "fiyati:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 24:
                        urunAdi = "Yogurt";
                        urunFiyati = 20;
                        System.out.println(urunMiktari + "kg" + "fiyati:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 25:
                        urunAdi = "Tereyagı";
                        urunFiyati = 250;
                        System.out.println(urunMiktari + "kg" + "fiyati:" + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 26:
                        urunAdi = "Ezine peyniri";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg" + "fiyati:" + urunFiyati * urunMiktari + "TL'dir");
                    case 27:
                        cikıs();
                        break;
                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Olusan sepet tutarı:" + toplam);
                sepet += urunAdi + "fiyatı:" + urunFiyati + "₺";
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz\n Ana menuye donmek icin 0'a basınız ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void manav() {
        System.out.println("--------Manav Reyonuna Hos Geldiniz---------");
        System.out.println("Lutfen almak istediğiniz urunun kodunu(UK) giriniz!");
        System.out.println("Elma fiyati:25₺ UK:11 \n Yerli Muz fiyatı:40₺ UK12 \n Domates fiyati:20₺ UK:13 \n Cilek fiyatı:40₺ UK14 \n Karnabahar fiyatı:60₺ UK15 ");

        while (!ekurun){

            urunKodu=scanner.nextInt();
            if (urunKodu>=11 && urunKodu<=15){
                System.out.println("Kac kg alacaksınız:");
                urunMiktari=scanner.nextInt();
                switch (urunKodu){
                    case 11:
                        urunAdi="Elma";
                        urunFiyati=25;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 12:
                        urunAdi="Yerli Muz";
                        urunFiyati=40;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 13:
                        urunAdi="Domates";
                        urunFiyati=20;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 14:
                        urunAdi="Cilek";
                        urunFiyati=100;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 15:
                        urunAdi="Karnabahar";
                        urunFiyati=60;
                        System.out.println(urunMiktari+"kg"+ "fiyati:"+urunFiyati*urunMiktari+"TL'dir");
                    case 16:
                        cikıs();
                        break;
                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Olusan sepet tutarı:"+toplam);
                sepet+=urunAdi+"fiyatı:"+urunFiyati+"₺";
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz\n Ana menuye donmek icin 0'a basınız ");
            }else if(urunKodu==0){
                girisEkrani();

            }
        }

    }

}
