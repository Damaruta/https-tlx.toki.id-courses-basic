import java.util.*;

public class a_seleksi_olimpiade {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int t = imput.nextInt();
        int urut = 0;
        for (int i = 0; i < t; i++) {
            int n = imput.nextInt();
            int m = imput.nextInt();
            int[][] nilai = new int[n][4];
            String check = imput.next();
            String[] id = new String[n];
            for (int j = 0; j < n; j++) {
                id[j] = imput.next();
                if (id[j].equals(check)) {
                    urut = j;
                }
                nilai[j][1] = imput.nextInt();
                nilai[j][2] = imput.nextInt();
                nilai[j][3] = imput.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (nilai[j][3] > nilai[urut][3]) {
                    m--;
                } else if (nilai[j][3] == nilai[urut][3]) {
                    if (nilai[j][2] > nilai[urut][2]) {
                        m--;
                    } else if (nilai[j][2] == nilai[urut][2]) {
                        if (nilai[j][1] > nilai[urut][1]) {
                            m--;
                        }
                    }
                }
            }
            if (m > 0) {
                System.out.println("YA");
            } else {
                System.out.println("TIDAK");
            }
        }
    }
}