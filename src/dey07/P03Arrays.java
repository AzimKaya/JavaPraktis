package dey07;

import java.util.Arrays;

public class P03Arrays {
    public static void main(String[] args) {

        int [] arr={12,25,36,48,25};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+2+" ");

        }


        for (int i :  arr) {
            System.out.print(i+2+" ");

        }


    }

}
