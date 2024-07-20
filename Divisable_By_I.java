import java.util.*;
import java.lang.*;
import java.io.*;

class Divisable_By_I
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n=scan.nextInt();
		    int a [] = new int[n];
		    if(n%2==0)
		    {
		        a[0]=n/2;
		        for(int i=1;i<n;i++)
		        {
		            if(i%2==1)
		            a[i]=a[i-1]+i;
		            else 
		            a[i]=a[i-1]-i;
		        }
		    }
		    else 
		    {
		        a[0]=(n/2)+1;
		        for(int i=1;i<n;i++)
		        {
		            if(i%2==1)
		            a[i]=a[i-1]-i;
		            else 
		            a[i]=a[i-1]+i;
		        }
		    }
		    for(int i=0;i<n;i++)
		    System.out.print(a[i]+" ");
		 System.out.println();
		}

	}
}
