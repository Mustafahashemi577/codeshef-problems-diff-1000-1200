import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class The_Product_Mystery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int gcd=new BigInteger(String.valueOf(b)).gcd(new BigInteger(String.valueOf(c))).intValue();
		    System.out.println(c/gcd);
		}

	}
}
