import java.util.*;
import java.lang.*;
import java.io.*;

class Hostel_Room
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int a [] = new int [n];
		    int maximum = x;
		    int sum =x;
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(a[i]>0){
		        sum+=a[i];
		        if(sum>maximum)
		        maximum=sum;
		        }
		        else
		        sum-=Math.abs(a[i]);
		        
		    }
		    System.out.println(maximum);
		    
		}

	}
}
