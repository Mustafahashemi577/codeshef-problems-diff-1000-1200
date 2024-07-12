import java.util.*;
import java.lang.*;
import java.io.*;

class AP_Free_Sequences
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    boolean find = true;
		    HashSet <Integer> differ = new HashSet<>();
		    for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		    }
		    if(n<3){
		        System.out.println("No");
		        return;
		    }
		     int p=0;
		    for(p=0;p<n-2;p++){
		        for(int q=p+1;q<n-1;q++){
		            for(int r=q+1;r<n;r++){
		                if((a[q]-a[p])==(a[r]-a[q])){
		                    System.out.println("No");
	                        p=n;
	                        break;
		                }
		            }
		            if(p==n){
		                break;
		            }
		        }
		        if(p==n){
		            break;
		        }
		    }
		    if(p==n-2){
		        System.out.println("Yes");
		    }
		} 

	}
}
