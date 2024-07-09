import java.util.*;
import java.lang.*;
import java.io.*;

class Large_Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a = scan.nextInt();
		    int d = (int)Math.sqrt(n);
		    System.out.println(d*a);
		}

	}
}
