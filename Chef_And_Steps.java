import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Steps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    String s = "";
		    for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		        if(a[i]%k==0)
		        s+='1';
		        else
		        s+='0';
		    }
		    System.out.println(s);
		}

	}
}
