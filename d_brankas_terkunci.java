import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d_brankas_terkunci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rl = br.readLine().split(" ");
        int n = Integer.parseInt(rl[0]);
        int k = Integer.parseInt(rl[1]);
        String arr = "";
        for (int i = 1; i <= n; i++) {
            arr += i;
        }
        combination(arr, "", k);
    }

    public static void combination(String current, String result, int k) {
        if (k == 0) {
            System.out.println(result.substring(0, result.length() - 1));
        }
        for (int i = 0; i < current.length(); i++) {
            combination(current.substring(i + 1), result + current.charAt(i) + " ", k - 1);
        }
    }
}