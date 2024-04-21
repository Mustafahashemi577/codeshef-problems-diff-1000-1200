import java.util.*;
import java.lang.*;
import java.io.*;

class Remove_Bad_Element2_by_HashMap
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
		    int max =1;
		    HashMap <Integer, Integer> check = new HashMap<>();
		    for(int i = 0;i<n;i++){
		        if(!check.containsKey(a[i]))
		        {
		            check.put(a[i],1);
		        }
		        else{
		            check.put(a[i],(check.get(a[i]))+1);
		        }
		        }
		         for(int key : check.keySet())
		            if(check.get(key)>max)
		                max = check.get(key);
		    
		    System.out.println(n-max);
		}

	}
}
