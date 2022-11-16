import java.util.Scanner;

public class d_hapus_satu_saja {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        for (int i = 0; i < A.length(); i++) {
            if (B.equals(A.substring(0, i) + A.substring(i + 1))) {
                System.out.println("Tentu saja bisa!");
                return;
            }
        }
        System.out.println("Wah, tidak bisa :(");
    }
}