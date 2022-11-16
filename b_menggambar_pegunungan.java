import java.util.Scanner;

public class b_menggambar_pegunungan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        gambar(N);
    }

    static void gambar(int n) {
        if (n > 0) {
            gambar(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            gambar(n - 1);
        }
    }
}