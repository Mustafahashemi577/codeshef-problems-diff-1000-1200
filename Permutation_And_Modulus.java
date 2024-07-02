import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation_And_Modulus
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		     int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=i+1;
		    }
		    for(int i =0;i<n-1;i++){
		        int temp = a[i];
		        a[i]=a[i+1];
		        a[i+1]=temp;
		    }
		    for(int i = 0;i<n;i++)
		    System.out.print(a[i]+" ");
		    System.out.println();
		}

	}
}
