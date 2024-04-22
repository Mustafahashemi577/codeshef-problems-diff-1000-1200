import java.util.*;
import java.lang.*;
import java.io.*;

class Football
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int [] a = new int [n];
		    int [] b =  new int [n];
		    long max = 0;
		    for(int i = 0;i<n;i++)
		         a[i]= scan.nextInt();
		         
		    for(int i = 0;i<n;i++)
		         b[i]= scan.nextInt();
		         
		    for(int i = 0;i<n;i++){
		        long toatl = a[i]*20-b[i]*10;
		        if (toatl>max)
		        max = toatl;
		    }
		    
		  System.out.println(max);
		}

	}
}
