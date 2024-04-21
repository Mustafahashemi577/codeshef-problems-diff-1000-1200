import java.util.*;
import java.lang.*;
import java.io.*;

class The_Great_Run
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int k = scan.nextInt();
	        int a[] = new int [n];
	        for(int i =0;i<n;i++)
	            a[i]=scan.nextInt();
	        int maximum = 0;
	        
	        for(int i =0;i<=n-k;i++){
	           int sum = 0;
	            for(int j =i;j<k+i;j++)
	            {
	                
	                sum+=a[j];
	                if(sum>maximum)
	                maximum=sum;
	            }
	        }
	        System.out.println(maximum);
	    }

	}
}
