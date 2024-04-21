import java.util.*;
import java.lang.*;
import java.io.*;

class Remove_Bad_Elements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i =0;i<n;i++)
		        a[i]= scan.nextInt();
		    int max = 1;
		    Arrays.sort(a);
		    for(int i =0;i<n-1;i++)
		    {
		        int frequence = 1;
		        int define = a[i];
		        for(int j =i+1;j<n;j++){
		            if(a[i]==a[j])
		            {
		                frequence++;
		                if(frequence>max)
		                max=frequence;
		            }
		            else
		            {
		                break;
		            }
		        }
		    }
		
		    System.out.println(n-max);
		}

	}
}
