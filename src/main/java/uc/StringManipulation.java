package uc;

public class StringManipulation {
    public static void main(String[] args) {

        //son karakteri alma
        // s.charAt(s.length()-1)

         /*
        Stack Memory'de
        1)Primitive Data'lar depolanir
        2)Non-primitive'lerin adresleri depolanir.(Reference)
         Heap Memory'de Non-primitive'ler depolanir.

    String s = "Tom";
    String t ="Terry";
    String r = "Tom";
    1) s==t ==> i) Adres ===> farkli
                ii)Deger ===>farkli

    2) s.equals(t) ==> i) Deger ==>farkli
       s.equals(r) ==>  i) Deger ==> Ayni
       Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
      Niye ?
      Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
      ikisi de ayni ise siz String'ler esittir dersiniz ama biz code yazarken genellikle String'lerin
      adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

      "equals()" method'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
      ihtiyac duydugumuz seydir.

        */

        String s = "bilal";
        String k = "bilal";


        if (s.equals(k)){
            System.out.println("its value is equal ");
        }
        System.out.println("****");

        if (s == k){  //it is wrong because we must use equals method!!
            System.out.println("its both value and address is equal");
        }


    }
}
