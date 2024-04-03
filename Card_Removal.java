import java.util.*;
import java.lang.*;
import java.io.*;

class Card_Removal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i =0;i<n;i++){
		        a[i] = scan.nextInt();
		    }
		    Arrays.sort(a);
		    int b =1;
		    int max = 1;
		    for(int i =0;i<n-1;i++){
		        if(a[i]==a[i+1])
		        {
		            b++;
		            if (b>max)
		                max=b;
		        }
		        else 
		        {
		            b=1;
		        }
		    }
		    if(max==n)
		    System.out.println(0);
		    else
		    System.out.println(max==1? n-1 : (n-max));
		    
		}

	}
}
