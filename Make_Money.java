import java.util.*;
import java.lang.*;
import java.io.*;

class Make_Money
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int c = scan.nextInt();
		    int a [] = new int [n];
		    int sum = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        sum += a[i];
		    }
		    Arrays.sort(a);
		    int count=0;
		    if(c==x || a[0]+c==x)
		    System.out.println(sum);
		    else{
		        sum=0;
		        for(int i=0;i<n;i++){
		        if((a[i]+c)<x){
		        sum+=x;
		        count++;
		        }
		        else
		        sum+=a[i];
		        }
		        
		        System.out.println(sum-(count*c));
		    }
		    
		}

	}
}
