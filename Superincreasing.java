import java.util.*;
import java.lang.*;
import java.io.*;

class Superincreasing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    long x = scan.nextLong();
		    long min =(int) Math.pow(2,k-1);
		    if(x>=min)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}

	}
}
