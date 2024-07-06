import java.util.*;
import java.lang.*;
import java.io.*;

class Download_File
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [2*n];
		    for(int i =0;i<a.length;i++){
		        a[i]= scan.nextInt();
		    }
		    int sum = 0;
		    for(int i = 0;i<a.length;i+=2){
		        if(k>0){
		            if(k>a[i]){
		            k-=a[i];
		            continue;
		            }
		            else{
		            sum += (a[i]-k)*a[i+1];
		            k=0;
		            }
		        }
		        else{
		        sum+=(a[i]*a[i+1]);
		        }
		    }
		    System.out.println(sum);
		}

	}
}
