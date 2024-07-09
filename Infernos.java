import java.util.*;
import java.lang.*;
import java.io.*;

class Infernos
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int a [] = new int [n];
		    int multitargetmode=0;
		     for(int i=0;i<n;i++){
		        a[i] = scan.nextInt();
		        if(a[i]>=x && a[i]%x==0){
		            multitargetmode = multitargetmode +a[i]/x - 1;
		        }
		        else{
		            multitargetmode = multitargetmode + a[i]/x;
		        }
		    }
		    int single = n+multitargetmode;
		    Arrays.sort(a);
		    int multi = a[n-1];
		    System.out.println(Math.min(single, multi));
		}
	}
}
