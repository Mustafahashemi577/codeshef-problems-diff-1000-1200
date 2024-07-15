import java.util.*;
import java.lang.*;
import java.io.*;

class Random_Pair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = scan.nextInt();
            Arrays.sort(a);
            int x = a[n - 1] + a[n - 2];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] + a[j] == x) c++;
                }
            }
            double u = (double)(n * (n - 1)) / 2;
            double v = (double) c;
            System.out.println(v / u);
        }
	}
}
