import java.util.*;
import java.lang.*;
import java.io.*;

class Priya_And_And
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t =scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int a [] = new int [n];
	        for(int i =0;i<n;i++){
	            a[i]= scan.nextInt();
	        }
	        int count = 0;
	        for(int i = 0;i<n;i++)
	            for(int j = i;j<n;j++){
	                if(i<j){
	                int temp = a[i]&a[j];
	                if(temp == a[i])
	                count++;
	                }
	            }
	            
	        System.out.println(count);
	    }

	}
}
