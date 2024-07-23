import java.util.*;
import java.lang.*;
import java.io.*;

class Hungry_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();
            int r = scan.nextInt();
            int minCostNormal = x * n;
            if (r < minCostNormal) {
                System.out.println(-1);
            } else {
                int maxPremiumBurgers = (r - (n * x)) / (y - x);
                maxPremiumBurgers = Math.min(maxPremiumBurgers, n);
                System.out.println(n-maxPremiumBurgers+" "+maxPremiumBurgers);
            }
		}

	}
}