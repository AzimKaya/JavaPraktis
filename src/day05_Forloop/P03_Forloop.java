package day05_Forloop;

public class P03_Forloop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i <=255; i++) {
            System.out.print(i+" - " +(char)i);
        }


    }
}
