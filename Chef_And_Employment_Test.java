import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Employment_Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t =scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    Arrays.sort(a);
		    int b = ((n+k)/2)+1;
		    System.out.println(a[b-1]);
		}

	}
}
