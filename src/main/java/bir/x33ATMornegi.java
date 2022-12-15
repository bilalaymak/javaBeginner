package bir;

import java.util.Scanner;

public class x33ATMornegi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        int islem;

        System.out.println("Bakiye giriniz");
        System.out.println("1: Bakiye görüntüleme");
        System.out.println("2: Para yatırma");
        System.out.println("3: Para çekme");
        System.out.println("4: Sistemden çıkış");

        islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz" + bakiye + "TL dir");
                break;
            case 2:
                System.out.println("Ne kadar yatıracaksınız?");
                int miktar = scan.nextInt();

                bakiye = bakiye + miktar;
                System.out.println("Bakiyeniz: " + bakiye + "TL'dir");
                break;
            case 3:
                System.out.println("Ne kadar çekeceksiniz?");
                miktar = scan.nextInt();

                bakiye = bakiye - miktar;
                System.out.println("Bakiyeniz: " + bakiye + "TL'dir");
                break;
            case 4:
                System.out.println("Sistemden çıkılıyor");
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;




        }



    }

}
