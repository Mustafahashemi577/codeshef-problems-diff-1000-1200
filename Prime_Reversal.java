import java.util.*;
import java.lang.*;
import java.io.*;

class Prime_Reversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String A = scan.next();
		    String B = scan.next();
		    int zero1 = 0, zero2 = 0, one1 = 0, one2 =0;
		    for(int i = 0;i<n;i++){
		        if (A.charAt(i)=='1')
		        one1++;
		        if (A.charAt(i)=='0')
		        zero1++;
		        if (B.charAt(i)=='1')
		        one2++;
		        if (B.charAt(i)=='0')
		        zero2++;
		    }
		    
		    if (zero2==zero1 && one2==one1)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
