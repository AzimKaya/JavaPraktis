package day08;

import java.util.Arrays;

public class P02 {

    public static void main(String[] args) {

/*
Verilen bir array'deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array'in son hali. : [7,4,5,6]
 */
        int[] input={4,5,6,7};

        elementleriSagaKaydir(input);

    }

    private static void elementleriSagaKaydir(int[] input) {

        int[] yeniArr=new int[input.length];

        yeniArr[0]=input[input.length-1];

        for (int i = 0; i < input.length-1; i++) {
            yeniArr[i+1]=input[i];


        }
        input=yeniArr;

        System.out.println(Arrays.toString(input));
    }
}
