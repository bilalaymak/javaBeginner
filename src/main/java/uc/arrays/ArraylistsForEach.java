package uc.arrays;

import java.util.ArrayList;

public class ArraylistsForEach {
    public static  void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();
        int[] arr = {10,20,30,40,50};


        groups.add("metallica");
        groups.add("iron maiden");
        groups.add("guns' n roses");
        groups.add("black sabbath");



        System.out.println("0.index = " + groups.get(0));
        System.out.println("2.index = " + groups.get(2));
        System.out.println("3.index = " + groups.get(3));
        System.out.println("arraylist uzunluk = " + groups.size());
        System.out.println(groups.indexOf("iron maiden"));//3. indexi gosterir(arraylistteki)
        /*
        groups.remove("iron maiden"); //remove String yapinca stringi siliyor
        groups.remove(0);//remove int yapinca index degerini siliyor
        Arraylstlerde silme islemi groups.remove methoduyla yapiliyor
        */


        for (int i =0; i< groups.size(); i++){
            System.out.println("eleman = " + groups.get(i));
        }
        for(String s:groups){ //for each loops
            System.out.println("eleman = " + s);
        }
        for(int i : arr){
            System.out.println("eleman = " + i);
        }


    }
}
