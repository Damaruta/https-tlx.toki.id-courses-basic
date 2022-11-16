import java.util.Scanner;

public class b_runtuh {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int r = ipt.nextInt();
        int c = ipt.nextInt();
        String kosong = new String();
        for (int i = 0; i < c; i++) {
            kosong = kosong.concat("0");
        }
        String[] data = new String[r];
        int rth = 0;
        for (int i = 0; i < r; i++) {
            data[i] = ipt.next();
            for (int j = 0; j < 10; j++) {
            }
            if (!data[i].contains("0")) {
                data[i] = kosong;
                rth = i;
            }
        }
        data = runtuh(data, r, c, rth);
        for (int i = 0; i < r; i++) {
            if (!data[i].contains("0")) {
                data[i] = kosong;
                data = runtuh(data, r, c, i);
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(data[i]);
        }
    }

    private static String[] runtuh(String[] data, int r, int c, int rth) {
        for (int i = 0; i < c; i++) {
            for (int j = rth - 1; j >= 0; j--) {
                if (data[j].substring(i, i + 1).equals("1")) {
                    for (int k = j; k < r; k++) {
                        if (k == r - 1) {
                            if (data[k].substring(i, i + 1).equals("0")) {
                                data[k] = replace(data[k], i, '1');
                                data[j] = replace(data[j], i, '0');
                                break;
                            }
                        } else if (data[k + 1].substring(i, i + 1).equals("1")) {
                            data[k] = replace(data[k], i, '1');
                            data[j] = replace(data[j], i, '0');
                            break;
                        }
                    }
                }
            }
        }
        return data;
    }

    private static String replace(String str, int index, char replace) {
        char[] charx = str.toCharArray();
        charx[index] = replace;
        return String.valueOf(charx);
    }
}