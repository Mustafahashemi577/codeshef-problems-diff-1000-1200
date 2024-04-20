import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[]= new int [n];
		    for(int i =0;i<n;i++){
		        a[i]= scan.nextInt();
		    }
		    long sum = 0;
		    for(int j =0;j<n-1;j++){
		        if(a[j]!=0)
		        {
		            sum= sum + Math.abs(a[j]-a[j+1]);
		        }
		    }
		    System.out.println(sum - n + 1);
		}

	}
}
