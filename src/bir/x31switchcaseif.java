package bir;

import java.util.Scanner;

public class x31switchcaseif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi == 1) {
            System.out.println("bir");
        }
        else if (sayi == 2) {
            System.out.println("iki");
        }
        else if (sayi == 3) {
            System.out.println("üç");
        }
        else if (sayi == 4) {
            System.out.println("dört");
        }
        else {
            System.out.println("Geçersiz sayı");
        }



    }



}
