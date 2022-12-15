package oop;

import java.util.ArrayList;

public class Arraylists {
    public static  void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();
        groups.add("metallica");
        groups.add("iron maiden");
        groups.add("guns' n roses");
        groups.add("black sabbath");

        System.out.println("0.index = " + groups.get(0));
        System.out.println("2.index = " + groups.get(2));
        System.out.println("3.index = " + groups.get(3));
        System.out.println("arraylist uzunluk = " + groups.size());

        groups.remove("iron maiden"); //remove String yapinca stringi siliyor
        groups.remove(0);//remove int yapinca index degerini siliyor
        System.out.println(groups.indexOf("iron maiden"));//3. indexi gosterir(arraylistteki)


        for (int i =0; i< groups.size(); i++){
            System.out.println("eleman = " + groups.get(i));
        }


    }
}
