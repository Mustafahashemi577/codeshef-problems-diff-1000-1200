import java.util.*;
import java.lang.*;
import java.io.*;

class Odd_GCD_Premutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		      if(n%2==1){
		        System.out.println(-1);}
		    else{
		        for(int i=n;i>0;i--)
		            System.out.print(i+" ");
		        System.out.println();
		    }
		}

	}
}
