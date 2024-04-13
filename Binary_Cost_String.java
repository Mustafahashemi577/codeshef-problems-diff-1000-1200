import java.util.*;
import java.lang.*;
import java.io.*;

class Binary_Cost_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    String s = scan.next();
		    int one =0;
		    int zero = 0;
		    for(int i =0;i<n;i++){
		        if(s.charAt(i)=='0')
		        zero++;
		        else
		        if (s.charAt(i)=='1')
		        one++;
		    }
		    if(zero==n || one == n)
		    System.out.println(0);
		    else
		    System.out.println(Math.min(x,y));
		}
	}
}
