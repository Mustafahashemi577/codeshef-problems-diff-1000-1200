import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Diet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    int k = scan.nextInt();
		    int sum = 0;
		    int p=n+1;
		    for(int i=0;i<n;i++)
		        a[i]=scan.nextInt();
		        
		    for(int i=0;i<n;i++){
		        if((a[i]+sum-k)>=0)
		        sum = a[i]+sum-k;
		        else
		        {
		        p=i;
		        break;
		        }
		    }
		    
		    System.out.println(p==n+1?"YES":"NO "+(p+1));
		}

	}
}
