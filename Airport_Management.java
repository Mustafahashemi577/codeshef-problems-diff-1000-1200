import java.util.*;
import java.lang.*;
import java.io.*;

class Airport_Management
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int d [] = new int [n];
		    Map <Integer, Integer> times = new HashMap<>();
		    for(int i = 0;i<n;i++){
		    a[i] = scan.nextInt();
		    if(!times.containsKey(a[i]))
		        times.put(a[i],1);
		    else
		        times.put(a[i],(times.get(a[i]))+1);
		    }
		    for(int i = 0;i<n;i++){
		    d[i] = scan.nextInt();
		    if(!times.containsKey(d[i]))
		    times.put(d[i],1);
		    else
		    times.put(d[i],times.get(d[i])+1);
		    }
		    int max = 0;
		    for(Map.Entry<Integer,Integer> entry : times.entrySet()){
		        if(entry.getValue()>max)
		        max=entry.getValue();
		    }
		    System.out.println(max);
		    
		}

	}
}
