import java.util.*;
import java.lang.*;
import java.io.*;
class Mixing_Extraordinaire
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while (t-->0){
	        int n = scan.nextInt();
	        long a [] =  new long [n];
	        for(int i = 0;i<n ;i++){
	            a[i]= scan.nextLong();
	        }
	        long total = 0;
	        for(int i = 0;i<n-1;i++){
	            for(int j=i+1;j<n;j++)
	            total+=a[i]*a[j];
	        }
	        System.out.println(total);
	        
	    } 
	
	}
}
