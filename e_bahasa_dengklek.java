import java.util.*;

public class e_bahasa_dengklek {
    public static void main(String[] args) {
        Scanner lv = new Scanner(System.in);
        String text = lv.nextLine();
        String hasil = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)))
                hasil += Character.toLowerCase(text.charAt(i));
            else
                hasil += Character.toUpperCase(text.charAt(i));
        }
        System.out.println(hasil);
    }
}