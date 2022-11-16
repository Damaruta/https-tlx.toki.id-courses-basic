import java.util.Scanner;

class b_faktorial_ganjil_genap {
    static int faktorial(int f) {
        if (f == 0 || f == 1) {
            return 1;
        } else if (f % 2 == 0) {
            return f / 2 * faktorial(f - 1);
        } else {
            return f * faktorial(f - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(faktorial(n));
    }
}