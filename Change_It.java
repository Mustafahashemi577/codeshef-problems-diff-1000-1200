import java.util.*;
import java.lang.*;
import java.io.*;

class Change_It
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int period = 1;
		    int temp =1;
		    Arrays.sort(a);
		    for(int i =0;i<n-1;i++){
		        if(a[i]==a[i+1]){
		        temp++;
		        if (temp>period)
		        period=temp;
		        }
		        else 
		        {
		            if(temp>period)
		            period=temp;
		            temp=1;
		        }
		    }
		    System.out.println(n-period);
		}

	}
}
