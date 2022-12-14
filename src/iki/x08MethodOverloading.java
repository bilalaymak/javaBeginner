package iki;

public class x08MethodOverloading {
    public static void main(String[] args) {

        scoreCalculate("bilal", 3000);
        scoreCalculate(1000);

    }


    public static void scoreCalculate(String name, int score){
        System.out.println(name + " isimli oyuncunun puani = " + score);
    }
    public static void scoreCalculate(int score){
        System.out.println("isimsiz oyuncunun puani = " + score);
    }











}
