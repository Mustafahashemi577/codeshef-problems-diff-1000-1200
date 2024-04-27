import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Stocks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[] = new int [n];
		    int sum =0;
		    for(int i =0;i<n;i++)
		    a[i]= scan.nextInt();
		    Arrays.sort(a);
		    for(int i =1;i<n;i++)
		    sum+=a[i];
		    System.out.println(sum);
		}

	}
}
