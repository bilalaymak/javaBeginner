package bir;

import java.util.Arrays;

public class if11 {
    static int x = 3;
    static int y = 7;

    public static void main(String[] args) {

        if(x>0) {
        }
        {
            int z = y * 7;
            int t = x + 3;
            for (String s : Arrays.asList("t değeri : " + t, "z değeri : " + z)) {
                System.out.println(s);
            }
        }
    }

}
