import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_XOR {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int j = 0; j < t; j++) {
            int y = scan.nextInt();
         
            int arr[] = new int[y];

            for (int i = 0; i < y; i++) {
                arr[i] = scan.nextInt();
            }

            int res = find(arr);
            System.out.println(res);
        }
    }

    public static int find(int[] arr) {
        int m_xin = Integer.MAX_VALUE;

        int x_all = 0;
        for (int num : arr) {
            x_all ^= num;
        }

        for (int i = 0; i < arr.length; i++) {
            int x_w_i = x_all ^ arr[i];
            m_xin = Math.min(m_xin, x_w_i);
        }

        m_xin = Math.min(m_xin, x_all);

        return m_xin;
    }
}
