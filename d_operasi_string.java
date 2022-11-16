import java.util.*;

public class d_operasi_string {
    public static void main(String[] args) {
        Scanner lv = new Scanner(System.in);
        String text = lv.nextLine();
        String text2 = lv.nextLine();
        String text3 = lv.nextLine();
        String text4 = lv.nextLine();
        text = text.replaceFirst(text2, "");
        text = text.replaceFirst(text3, text3 + text4);
        System.out.println(text);
    }
}