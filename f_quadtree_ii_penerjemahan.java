import java.util.*;
import java.lang.*;
import java.io.*;

class f_quadtree_ii_penerjemahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<String>();
        int length = sc.nextInt();
        for (int i = 0; i < length; i++)
            arr.add(sc.next());
        int row = sc.nextInt();
        int col = sc.nextInt();
        int size = Math.max(row, col);
        int checkSize = size & (size - 1);
        if (checkSize != 0) {
            double power = (Math.log(size) / Math.log(2)) + 1;
            double sizeD = Math.pow(2, (int) power);
            size = (int) sizeD;
        }
        int[][] result = new int[row][col];
        fill(arr, result, row, col, size);
        print(result, row, col);
    }

    public static void print(int[][] result, int row, int col) {
        for (int i = 0; i < row; i++) {
            int j;
            for (j = 0; j < col - 1; j++)
                System.out.print(result[i][j] + " ");
            System.out.println(result[i][j]);
        }
    }

    public static void fill(List<String> arr, int[][] result, int row, int col, int size) {
        if (arr.size() == 0)
            return;
        while (arr.size() != 0) {
            String rule = arr.get(0);
            arr.remove(rule);
            fill(rule, result, 0, 0, row, col, size);
        }
    }

    public static void fill(String rule, int[][] result, int startX, int startY, int row, int col, int size) {
        if (rule.length() == 1) {
            for (int i = startY; i < startY + size && i < row; i++)
                for (int j = startX; j < startX + size && j < col; j++)
                    result[i][j] = 1;
        } else {
            char c = rule.charAt(1);
            rule = rule.substring(1);
            size = size / 2;
            if (c == '0')
                fill(rule, result, startX, startY, row, col, size);
            else if (c == '1')
                fill(rule, result, startX + size, startY, row, col, size);
            else if (c == '2')
                fill(rule, result, startX, startY + size, row, col, size);
            else
                fill(rule, result, startX + size, startY + size, row, col, size);
        }
    }
}