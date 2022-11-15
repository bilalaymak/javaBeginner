package practice;

import static practice.practice3.stringDeger;

public class practice4 {
    static String stringDeger = "Hi everyone";
    public static String substringDeger;

    static {
        substringDeger = stringDeger.substring(3);
    }

    public static void main(String[] args) {
        System.out.println(substringDeger);
    }

    }
