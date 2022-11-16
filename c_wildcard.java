import java.util.*;

public class c_wildcard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.next();
        int n = in.nextInt();
        key = key.replace("*", "(.*)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String temp = in.next();
            if (temp.matches(key)) {
                sb.append(temp + "\n");
            }
        }
        System.out.println(sb);
    }
}