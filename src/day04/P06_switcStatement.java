package day04;

import java.util.Scanner;

public interface P06_switcStatement {
    public static void main(String[] args) {

        //Kullacidan 2 basamaklı bir sayi alip ,girilen sayiyi yazi ile yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz :");

        int sayi=scanner.nextInt();
        if (sayi>=10 && sayi<99){
            int birlerBasamagi =sayi%10;
            int onlarBasamagi=sayi/10;

            switch (onlarBasamagi){
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmıs");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;


            }switch (birlerBasamagi) {


                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("Uc");
                    break;
                case 4:
                    System.out.print("Dort");
                    break;
                case 5:
                    System.out.print("Bes");
                    break;
                case 6:
                    System.out.print("Altı");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;



            }
        }

    }
}
