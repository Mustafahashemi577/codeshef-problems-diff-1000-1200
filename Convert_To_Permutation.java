import java.util.*;
import java.lang.*;
import java.io.*;

class Convert_To_Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    boolean found = true;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    Arrays.sort(a);
		    int operation =0;
		    for(int i = 0;i<n;i++){
		        while(a[i]<i+1){
		            a[i]++;
		            operation++;
		        }
		        if(a[i]>i+1){
		        found = false;
		        break;   
		        }
		    }
		    System.out.println(found==false?"-1":operation);
		}

	}
}
