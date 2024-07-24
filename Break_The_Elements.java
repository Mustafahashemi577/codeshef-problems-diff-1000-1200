import java.util.*;
import java.lang.*;
import java.io.*;

class Break_The_Elements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int evens = 0;
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(a[i]%2==0)
		        evens++;
		    }
		    if(n==1 || evens == n)
		    System.out.println(0);
		    else
		    System.out.println(evens);
		}

	}
}
