import java.util.*;
import java.lang.*;
import java.io.*;

class Mask_Policy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a = scan.nextInt();
		    System.out.println(Math.min(n-a,a));
		}

	}
}
