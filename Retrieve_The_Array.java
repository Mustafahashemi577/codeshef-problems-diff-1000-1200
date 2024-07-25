import java.util.*;
import java.lang.*;
import java.io.*;

class Retrieve_The_Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long [] b = new long[n];
		    long sumB = 0, sumA = 0;
		    for(int i=0; i<n; i++){
		        b[i] = scan.nextLong();
		        sumB += b[i];
		    }
		    sumA = sumB / (n+1);
		    for(int i=0; i<n; i++){
		        System.out.print((b[i] - sumA)+" ");
		    }
		    System.out.println();
		}

	}
}
