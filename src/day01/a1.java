package day01;

public class a1 {
    public static void main(String[] args) {

        // Bir satırlık yorumlar başına iki adet bölü çizgisi(slash) koyarak yapılır
        // Ben bu java ile programlamayı en iyi şekilde öğreneceğim.
        // Öğrendikten sonra bununla çalışmalar yapacağım

    /*
    Bu şekilde yapılan yorumlarda
    istediğimizkadar satırı yorum  olarak ifade edebiliriz
     */

    /*
    Programcılığın temeli "Hello World" dür.
     */

        // Print Fonksiyonu
        // print fonsiyonu metinsel ifadelerin(String) ve diğer veri türlerini (variable)
        // metin olarak yazdırılmasını sağlar
        // bu fonksiyonda iki adet yazdırma olur
        // println: yazdırıp bir sonraki satıra geçer. İşleme sonraki satırdan devam eder.
        // print: yazdırıp aynı satırda kalıp sonraki işlemi aynı satırdan devam ettirir.


            // println Fonksiyonu
            System.out.println("Hello World");
            System.out.println("Hello Wise");

            // print Fonksiyonu
            System.out.print("Hello World - ");
            System.out.println("Hello Wise");



        /*
       \n   :bir alt satirdan yazmaya baslar
       \t   :1 TAB bosluk birakir
       \"   :" yazar
       \'   :' yazar
       \\   : \ yazar
         */
            System.out.println("=========================================");
            System.out.println("Hello World\nHello Wise");
            System.out.println("Hello\tWorld");

         /*
        Soru - 1
        Konsola Hello World ve "Hello World" yazdırınız.
         */

            System.out.println("Hello World\t\n\"Hello Wise\"");
    }
}
