import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Eid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for (int i = 0;i<n ;i++ ){
		        a[i]=scan.nextInt();
		    }
		    Arrays.sort(a);
		    int difference =Integer.MAX_VALUE;
		        for(int j=0;j<n-1;j++){
		        difference = Math.min(difference ,Math.abs(a[j]-a[j+1]));
		    }
		    System.out.println(difference);
		}

	}
}
