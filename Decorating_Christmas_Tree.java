import java.util.*;
import java.lang.*;
import java.io.*;

class Decorating_Christmas_Tree
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int count = 0;
		    int a = y/3;
		    if(a<x){
		        System.out.println((a+((x-a)/2))>=n? "YES":"NO");
		    }
		    else if(a==x)
		    {
		        System.out.println(a>=n?"YES":"NO");
		    }
		    else
		    System.out.println(x>=n? "YES":"NO");
		}

	}
}
