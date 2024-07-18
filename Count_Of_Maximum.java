import java.util.*;
import java.lang.*;
import java.io.*;

class Count_Of_Maximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    HashMap <Integer, Integer> store = new HashMap<>();
		    for(int i = 0;i<n;i++){
		        if(!store.containsKey(a[i]))
		        store.put(a[i],1);
		        else
		        store.put(a[i],store.get(a[i])+1);
		    }
		    int c = -1;
		    int b = -1;
		    for(Map.Entry<Integer,Integer> entry : store.entrySet()){
		        int key = entry.getKey();
		        int value = entry.getValue();
		        if(value>b){
		        c = key;
		        b = value;
		        }
		        else if (value==b){
		            if(key<c){
		                c=key;
		                b=value;
		            }
		        }
		    }
		    System.out.println(c+" "+b);
		}

	}
}
