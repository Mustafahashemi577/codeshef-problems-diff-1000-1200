import java.util.*;
import java.lang.*;
import java.io.*;

class Dividing_Stamps
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	        int n = scan.nextInt();
	        int a [] = new int [n];
	        int sum = 0;
	        int all = 0;
	        for(int i =0;i<n;i++){
	            a[i]=scan.nextInt();
	            all+=a[i];
	            sum+=(i+1);
	        }
	        System.out.println(sum==all?"YES":"NO");
	    

	}
}
