import java.util.Scanner;

public class d_kasur_rusak {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String balik = "";
        String kata = keyboard.nextLine();
        int panjang = kata.length();
        for (int i = panjang - 1; i >= 0; i--) {
            balik = balik + kata.charAt(i);
        }
        if (kata.equals(balik)) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}