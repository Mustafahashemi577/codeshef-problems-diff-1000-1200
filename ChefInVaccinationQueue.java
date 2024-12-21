import java.util.*;
import java.lang.*;
import java.io.*;

class ChefInVaccinationQueue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int p = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int sum = 0;
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(i<p){
		            if(a[i]==1)
		            sum+=y;
		            else 
		            sum+=x;
		        }
		    }
		    System.out.println(sum);
		}

	}
}
