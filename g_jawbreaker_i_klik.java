import java.util.*;

public class g_jawbreaker_i_klik {
    static int[][] aG = null;
    static int xG, yG;
    static int sum = 0;

    public static void xx(int x, int y, int v) {
        if (aG[x][y] == v) {
            aG[x][y] = -1;
            sum++;
            if (y + 1 != yG)
                xx(x, y + 1, v);
            if (x + 1 != xG)
                xx(x + 1, y, v);
            if (x != 0)
                xx(x - 1, y, v);
            if (y != 0)
                xx(x, y - 1, v);
        }
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] a = new int[x][y];
        xG=x;
        yG=y;
        aG=a;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                a[i][j] = in.nextInt();
            }
        }
        int z = in.nextInt();
        int w = in.nextInt();
        xx(z,w,a[z][w]);
        System.out.println(sum*(sum-1));
    }
}