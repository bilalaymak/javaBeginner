package iki;

import java.util.Scanner;

public class x1whiledonguleri {

    /*
    döngü başlatma

    while(koşul) {
    işlem 1
    işlem 2
    işlem 3
    }
    ...
    ...
              artma, azalma
     */


    public static void main(String[] args) {

        //while artma
        int i = 0;
        while (i < 10) {

            System.out.println("Java döngü artma");
            i++;
        }
        System.out.println("döngü bitti \n" + i);

        //while azalma

        int a = 10;

        while (a > 0) {
            System.out.println("Java döngü azalma");
            a--;
        }
        System.out.println("döngü bitti \n" + a);


        //factorial sorusu

        Scanner scan = new Scanner(System.in); //Scanner Object

        System.out.println("sayıyı giriniz");

        int sayi = scan.nextInt();

        int factorial = 1;

        while (sayi>=1){
            factorial = factorial* sayi;
            System.out.println("factorial = " + factorial + "sayı" + sayi);


            sayi--;

        }
        System.out.println("factorial = " + factorial);

        int x = 0;

        while (x<5){
            int y = 0;
            while (y<5){
                System.out.println("x = " + x + " y = " + y);
                y++;
            }
            x++;
        }










    }
}
