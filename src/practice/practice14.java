package practice;

public class practice14 {
     public static boolean sifreUzunluguKontrol(String sifre) {
        if(sifre.length() < 7)
            return false;
        else return true;
    }
    public static void main(String[] args) {
        System.out.println(sifreUzunluguKontrol("Merhabalar"));
        System.out.println(sifreUzunluguKontrol("Selam"));
    }
}
