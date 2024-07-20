import java.util.*;
import java.lang.*;
import java.io.*;

class A_Balanced_Contest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int p = scan.nextInt();
		    int a [] = new int [n];
		    int cakewalk = 0;
		    int hard = 0;
		    for(int i = 0; i<n;i++){
		        a[i] = scan.nextInt();
		        if(a[i]<=p/10)
		        hard++;
		        else if(a[i]>=p/2)
		        cakewalk++;
		    }
		    //System.out.println(hard+" "+cakewalk);
		    if(cakewalk==1 && hard==2)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		    
		}
	}
}
