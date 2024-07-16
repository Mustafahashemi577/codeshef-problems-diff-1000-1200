import java.util.*;
import java.lang.*;
import java.io.*;

class A_Books
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i =0;i<n;i++)
		    a[i]=scan.nextInt();
		    int b[]=new int [n];
		    for(int i=0;i<n;i++)
		    {
		        int count=0;
		        for(int j=i+1;j<n;j++)
		        {
		            if(a[i]<a[j])
		                count++;
		        }
		        b[i]=count;
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(b[i]+" ");
		    }
		    System.out.println();
		}

	}
}
