import java.util.*;
import java.lang.*;
import java.io.*;

class Buying_New_Tablet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int b = scan.nextInt();
		    int a [] = new int [3*n];
		    int max = 0;
		    for(int i =0;i<3*n;i++){
		        a[i]=scan.nextInt();
		    }
		    for(int i =0;i<3*n;i+=3){
		        if(a[i]*a[i+1]>max&&a[i+2]<=b)
		        {
		            max = a[i]*a[i+1];
		        }
		    }
		    System.out.println(max==0?"no tablet":max);
		}

	}
}
