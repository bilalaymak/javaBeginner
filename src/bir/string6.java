package bir;

import java.util.Objects;

public class string6 {
    static String stringDeger = "string practice";

    public static void main(String[] args) {
        System.out.println(stringDeger.replace("g","t"));
        System.out.println(stringDeger.replace("string", "practice"));
        System.out.println(stringDeger.compareTo("string"));
        System.out.println(Objects.equals(stringDeger, "string"));
    }
}
