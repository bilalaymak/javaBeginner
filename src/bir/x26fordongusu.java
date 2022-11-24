package bir;

import java.util.Scanner;

public class x26fordongusu {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double n, ort, top;
            int i;

            top = 0;
            for (i = 1; i <= 5; i++) {
                System.out.println("n icin sirasiyla beş deger giriniz");
                n = input.nextDouble();
                top = top + n;
            }
            ort = top / 5;
            System.out.println(ort);
        }
    }


