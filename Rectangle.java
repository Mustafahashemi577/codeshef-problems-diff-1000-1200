import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a [] = new int [4];
		    for(int i = 0;i<4;i++){
		        a[i]= scan.nextInt();
		    }
		    boolean possibility = false;
		    Arrays.sort(a);
		    if(a[0]==a[1])
		        if(a[2]==a[3])
		        possibility=true;
		    
		    System.out.println(possibility==true ? "YES":"NO");
		}

	}
}
