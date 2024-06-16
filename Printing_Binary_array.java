import java.util.*;
import java.lang.*;
import java.io.*;

class Printing_Binary_array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int c [] = new int [n];
		    int a [] = new int [n];
		    for(int i =0;i<n;i++){
		        c[i]=scan.nextInt();
		    }
		    for(int i =0;i<n;i++){
		        if(c[i]==1)
		        a[i] = 0;
		        
		        if(c[i]==0)
		        a[i] = 1;
		    }
		    for(int i = 0;i<n;i++)
		        System.out.print(a[i]+"  ");
		        System.out.println();
		    
		    
		}

	}
}
