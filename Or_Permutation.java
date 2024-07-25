import java.util.*;
import java.lang.*;
import java.io.*;

class Or_Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=n-i;
		    }
		    for(int i = 0;i<n;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}

	}
}
