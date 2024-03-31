import java.util.*;
import java.lang.*;
import java.io.*;

class Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    boolean find = true;
		    int n = scan.nextInt();
		    int a [] = new int [2*n];
		    for(int i = 0;i<2*n;i++){
		        a[i]= scan.nextInt();
		    }
		    Arrays.sort(a);
		    for(int i =0;i<2*n-2;i++){
		        if (a[i]==a[i+1] && a[i+1]==a[i+2])
		        {
		            find = false;
		            break;
		        }
		    }
		    System.out.println(find==false? "No" : "Yes");
		}

	}
}
