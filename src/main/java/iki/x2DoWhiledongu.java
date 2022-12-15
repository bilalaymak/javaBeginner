package iki;

import java.util.Scanner;

public class x2DoWhiledongu {
    public static void main(String[] args) {

        /*
        do {

        }
        while(koşul){

        }
         */
        int n = 10;
        do {
            System.out.println("n = " + n);

            n--;

        }
        while (n > 0);

        //1234 sayısının rakamları toplamı nedir?

        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        System.out.println("lütfen rakamları toplamını almak istediğiniz sayıyı giriniz");
        int sayi = scan.nextInt();

        do {
            toplam += sayi % 10;
            sayi = sayi / 10;

            System.out.println("toplam = " + toplam + " sayı = " + sayi);

        }
        while (sayi > 0);
        System.out.println("toplam = " + toplam);


    }
}
