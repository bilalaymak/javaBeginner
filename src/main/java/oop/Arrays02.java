package oop;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr2 = new int[5];
        System.out.println("arrayin degerlerini girin");
        for (int i= 0; i< arr2.length; i++){
            arr2[i] = scan.nextInt();
        }
        mean(arr2);




    }

    public static void mean(int[] arr){
        double total =0;

        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("ortalama = " + total / arr.length);
    }



















}
