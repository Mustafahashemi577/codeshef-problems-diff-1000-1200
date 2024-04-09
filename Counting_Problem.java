import java.util.*;
import java.lang.*;
import java.io.*;

class Counting_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int odd =0;
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		        if (a[i]%2!=0)
		        odd++;
		    }
		    System.out.println(odd%2==0 && odd!=0?"YES":"NO");
		}

	}
}
