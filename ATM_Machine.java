import java.util.*;
import java.lang.*;
import java.io.*;

class ATM_Machine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    String s = "";
		    int a [] = new int [n];
		    for(int i =0;i<n;i++){
		        int x = scan.nextInt();
		        a[i]= x;
		          if (x<=k)
		        {
		            s+=1;
		            k=k-x;
		           
		        }
		        else
		        s+=0;
		    }
		    System.out.println(s);
		    
		}

	}
}
