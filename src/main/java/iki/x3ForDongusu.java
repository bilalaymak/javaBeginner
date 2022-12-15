package iki;

public class x3ForDongusu {
    /*
    for(başlatma;koşul;arttırma,azaltma){

    işlemler

    }

     */

    public static void main(String[] args) {

        int i;
        int j;

        for (i = 0, j = 0; i < 10 && j <5; i++,j++) {
        /*int i = 0;
        for (;i<10; i++) da yapabiliriz. fakat parantez içinde ; işareti kalması lazım
        */
            System.out.println("i = " + i +" j = "+ j);
        }

        System.out.println("");

        for (i = 0, j = 0; i < 10 || j <5; i++,j++) {
            System.out.println("i = " + i +" j = "+ j);
        }

        System.out.println("");

        //içiçe for döngüsü, matrislerde kullanılır

        int a;
        int b;

        for (a= 0; a < 5;a++){
            for (b = 0; b < 5; b++){
                System.out.println("a = " + a + " b = " + b);
            }
        }


    }
}
