import java.util.*;
import java.lang.*;
import java.io.*;

class Maximize_Adjacent_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t =scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[] = new int [n];
		    int sum =0;
		    for(int i =0;i<n;i++)
		        a[i]=scan.nextInt();
		        
		    Arrays.sort(a);
		    int temp = a[n-1];
		    a[n-1]=a[1];
		    a[1]=temp;
		    
		        
		    for(int i = 0;i<n-1;i++)
		    sum += a[i]+a[i+1];
		    
		    System.out.println(sum);
		}

	}
}
