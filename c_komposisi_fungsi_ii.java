import java.util.Scanner;

public class c_komposisi_fungsi_ii {
    static int fungsi(int a, int b, int k, int x) {
        if (k == 1) {
            return Math.abs(a * x + b);
        } else {
            return Math.abs(a * fungsi(a, b, k - 1, x) + b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, k, x;
        a = input.nextInt();
        b = input.nextInt();
        k = input.nextInt();
        x = input.nextInt();
        System.out.println(fungsi(a, b, k, x));
    }
}
