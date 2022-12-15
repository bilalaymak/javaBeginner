package bir;

import java.util.Scanner;

public class x30kullaniciadigirisi {
    public static void main(String[] args) {
        String sys_kul_adi = "bilal";
        String parola = "12345";

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adı:");
        String kullanici_adi = scan.nextLine();

        System.out.println("Parola:");
        String kul_parola = scan.nextLine();

        if (!(sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))) {
            System.out.println("Kullanıcı adı ve Parola yanlış");

        } else if ((sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kul_parola))) {

            System.out.println("Parola yanlış");
        } else if (!(sys_kul_adi.equals(kullanici_adi)) && (parola.equals(kul_parola))) {
            System.out.println("Kullanıcı adı yanlış");
        }
        else {
            System.out.println("Giriş başarılı!");

        }
    }
}
