package bir;

import java.util.Scanner;

public class x28ifinput {


    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.println("Notunuzu giriniz:");
        int  note = intput.nextInt();

        if(note > 90) {
            System.out.println("Dersten geçtiniz! notunuz AA");
        } else if (note > 80) {
            System.out.println("Dersten geçtiniz! notunuz BA");

        } else if (note > 70) {
            System.out.println("Dersten geçtiniz!");
        } else {
            System.out.println("Dersten kaldınız!");
        }

    }
}
