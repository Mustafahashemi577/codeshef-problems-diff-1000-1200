import java.util.*;
import java.lang.*;
import java.io.*;

class Airline_Restriction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    int e = scan.nextInt();
		    if (((a+b)<=d && c<=e) || (a+c<=d && b<=e) || (c+b<=d && a<=e))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
