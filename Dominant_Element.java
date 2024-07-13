import java.util.*;
import java.lang.*;
import java.io.*;

class Dominant_Element
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while (t-->0){
	        int n = scan.nextInt();
	        int a [] = new int [n];
	        HashMap <Integer, Integer> define = new HashMap<>();
	        for(int i = 0;i<n;i++){
	            a[i]=scan.nextInt();
	            if(define.get(a[i])==null){
	                define.put(a[i], 1);
	            }
	            else{
	                define.put(a[i],define.get(a[i])+1);
	            }
	        }
	        if(n==1)
	        System.out.println("YES");
	        else{
	            int max = 0;
	            for(Map.Entry<Integer, Integer> map : define.entrySet()){
	                if(map.getValue()>max)
	                    max = map.getValue();
	                
	            }
	            int max2 = 0;
	            for(Map.Entry<Integer, Integer> map : define.entrySet()){
	                if(map.getValue()==max)
	                max2++;
	            }
	            System.out.println(max2>1?"NO":"YES");
	        }
	        
	    } 

	}
}
