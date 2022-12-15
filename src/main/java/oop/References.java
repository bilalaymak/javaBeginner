package oop;

public class References {
    public static void main(String[] args) {
        /*Car car1 = new Car("Gumus","Renoult Megane", 1.6, 4);

        car1.showInfos();

        Car car2 = car1;
        car2.showInfos();

        Car car3 = null;
        car3.showInfos();
        //null reference da object olusturuldu fakat memoryde bos bir alandan baska bir ifadesi yok
        null reference mobil programlamada cok kullaniliyor
         */

        String s1 = new String("Bilal");
        String s2 = new String("Bilal");
        if (s1.equals(s2)){
            System.out.println("esit");
        }
        else {
            System.out.println("esit degil");
        }


    }
}
