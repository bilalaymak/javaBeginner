package bir;

public class x12if {
    static int x = 2;
    static int z;

    static {
        z = x * 5;
    }

    public static void main(String[] args) {

        if (x > 0) {
            z = x * 5;

        }
        System.out.println("z değeri : " + z);
    }
}
