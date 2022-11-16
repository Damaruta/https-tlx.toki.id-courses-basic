import java.util.Scanner;

public class c_permutasi_zig_zag {
    static int[] catat = new int[10], pernah = new int[10];
    public static int bil, cek = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bil = in.nextInt();
        for (int i = 1; i <= bil; i++) {
            pernah[i] = 0;
        }
        tulis(1);
    }

    static int cekArr() {
        if (bil <= 2) {
            cek = 1;
        }
        for (int i = 2; i <= bil - 1; i++) {
            if (catat[i - 1] < catat[i] && catat[i] > catat[i + 1]
                    || catat[i - 1] > catat[i] && catat[i] < catat[i + 1]) {
                cek = 1;
            } else {
                cek = 0;
                break;
            }
        }
        return cek;
    }

    static void tulis(int kedalaman) {
        if (kedalaman > bil) {
            cek = cekArr();
            if (cek != 0) {
                for (int i = 1; i <= bil; i++) {
                    System.out.print(catat[i]);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= bil; i++) {
                if (pernah[i] == 0) {
                    pernah[i] = 1;
                    catat[kedalaman] = i;
                    tulis(kedalaman + 1);
                    pernah[i] = 0;
                }
            }
        }
    }
}