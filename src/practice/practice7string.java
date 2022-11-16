package practice;

public class practice7string {
    static String stringDeger = "string practice";

    public static void main(String[] args) {
        boolean first = stringDeger.equals("string practice");
        boolean second = stringDeger.equals("strng practice");
        System.out.println(first);
        System.out.println(second);
    }
}
