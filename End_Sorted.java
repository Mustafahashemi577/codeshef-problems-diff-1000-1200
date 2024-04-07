import java.util.*;
import java.lang.*;
import java.io.*;

class End_Sorted
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int first = n+1;
		    int last = -1;
		    for(int i =0;i<n;i++){
		        a[i]= scan.nextInt();
		        if (a[i]==1)
		        first = i;
		        if (a[i]==n)
		        last=i;
		    }
		    if (first<last)
		    System.out.println(first+(n-1)-last);
		    else 
		    System.out.println((first+(n-1)-last)-1);
		    
		}

	}
}
