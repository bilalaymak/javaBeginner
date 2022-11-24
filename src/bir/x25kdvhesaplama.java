package bir;

import java.util.Scanner;

public class x25kdvhesaplama {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        double fiyat, kdv, kdvliFiyat;

        kdv = 0.18;
        System.out.println("lütfen fiyat giriniz");
        fiyat = input.nextDouble();


        if (fiyat<= 0) {
            System.out.println("Fiyat sıfırdan küçük olduğu için program sonlandırıldı.");
        }
        else {
            kdvliFiyat = fiyat + (fiyat * kdv);
            System.out.println(kdvliFiyat);
        }
    }




}
