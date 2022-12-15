package iki;

public class x05ContineWhile {
    public static void main(String[] args) {

        //CONTINUE

        int i = 0;
        while (i< 10){
            if (i == 4 || i == 7 ){
                i++;                     //buradaki islem dongude 4 ve 5. islemleri atlamasina sebeb olur, while
                                         //dongusunu tekrar baslatir
                                         // i++ konulmazsa dongu sonsuz donguye girer
                // if icerisindeki i++ konulmazsa i 4 de kalir fakat dongu islemeye devam eder
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }


    }
}
