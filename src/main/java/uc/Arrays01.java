package uc;

import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[5];

        for (int i =0; i<arr1.length; i++){
            System.out.println("eleman = " + arr1[i]);


        }

        System.out.println("array 2'nin degerlerini giriniz");
        for (int i =0; i<arr2.length; i++){
            arr2[i] = scan.nextInt();
        }
        System.out.println("array 2'nin degerleri yaziliyor");
        for (int i =0; i<arr2.length; i++){
            System.out.println("eleman = " + arr2[i]);


        }













/*
        int[] arr2 = new int[5];

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println("array 2'nin birinci elemani = " + arr2[0]);
        System.out.println("array 1'nin ikinci elemani = " + arr1[1]);

 */


    }
}
