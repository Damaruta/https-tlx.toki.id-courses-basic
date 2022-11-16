import java.sql.Array;
import java.util.*;

public class f_gaya_penulisan_variabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String r = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("_")) {
                r += s[++i].toUpperCase();
            } else if (s[i].charAt(0) < 97) {
                r += "_" + s[i].toLowerCase();
            } else {
                r += s[i];
            }
        }
        System.out.println(r);
    }
}