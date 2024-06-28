import java.util.*;
import java.lang.*;
import java.io.*;

class Easy_Math
{
    public static int sum(int c){
        int a = c;
        int sump = 0;
        while(a>0){
            int d = a-10*(a/10);
            sump+=d;
            a/=10;
        }
        return sump;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++)
		        a[i]=scan.nextInt();
		    
		    int maxSum = 0;
		    for(int i = 0;i<n-1;i++)
		        for(int j = i+1;j<n;j++){
		            int b = a[i]*a[j];
		            int v = sum (b);
		            if(maxSum<v)
		            maxSum=v;
		        }
		
		    System.out.println(maxSum);
		}

	}
}
