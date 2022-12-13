package iki;

import java.util.Scanner;

public class x4BreakWhile {
    public static void main(String[] args) {


        //BREAK

        while (true){
            Scanner scan = new Scanner(System.in);
            String s;
            System.out.println("Karakter giriniz:");
            s = scan.nextLine();

            if (s.equals("q")){

                System.out.println("Programdan cikiliyor");
                break;
            }
            System.out.println("Character" +s);

           break;//eger dongunun devam etmesini istiyorsak break koymayiz(bizden surekli karakter ister
        }





    }
}
