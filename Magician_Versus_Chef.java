import java.util.*;
import java.lang.*;
import java.io.*;

class Magician_Versus_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int s = scan.nextInt();
		    int a [] = new int [s*2];
		    for(int i = 0;i<s*2;i++){
		        a[i]=scan.nextInt();
		    }
		    int currentbox=x;
		    for(int i =0;i<s*2;i+=2){
		       if(currentbox==a[i])
		       currentbox=a[i+1];
		       else if(currentbox==a[i+1])
		       currentbox=a[i];
		    }
		    System.out.println(currentbox);
		}

	}
}
