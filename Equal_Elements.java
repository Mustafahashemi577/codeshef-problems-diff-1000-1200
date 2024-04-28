import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_Elements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n+1];
		    for(int i =0;i<n;i++){
		        int c = scan.nextInt();
		        a[c]++;
		    }
		    int max = 0;
		    for(int i = 0;i<n+1;i++){
		        if(a[i]>max)
		        max = a[i];
		    }
		    System.out.println(n-max);
		}

	}
}
