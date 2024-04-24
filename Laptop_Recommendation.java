import java.util.*;
import java.lang.*;
import java.io.*;

class Laptop_Recommendation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		    }
		    HashMap <Integer,Integer> recommends = new HashMap<>();
		    for(int i = 0;i<n;i++){
		        if(!recommends.containsKey(a[i]))
		        {
		            recommends.put(a[i],1);
		        }
		        else
		        {
		            recommends.put(a[i],(recommends.get(a[i]))+1);
		        }
		    }
		    int max = 0;
		    int max2 =0;
		    int value=-1;
		    for (int key : recommends.keySet())
		    {
		        if((recommends.get(key))>=max){
		        max2 = max;
		        max = recommends.get(key);
		        value = key;
		        }
		    }
		    System.out.println(max2==max?"CONFUSED":value);
		}

	}
}
