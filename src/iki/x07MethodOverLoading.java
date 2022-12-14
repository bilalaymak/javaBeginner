package iki;

public class x07MethodOverLoading {
    public static void main(String[] args) {

        // method overloading

        System.out.println("toplamalari = " + toplama(1,2,3));
        System.out.println("toplamalari = " + toplama(1,2));


    }

    public static int toplama(int a, int b, int c){

       return (a+b+c);


    }
    public static int toplama(int a, int b){

        return (a+b);

    }





}
