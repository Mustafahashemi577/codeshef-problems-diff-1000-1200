import java.util.*;
import java.lang.*;
import java.io.*;

class Stick_Break
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int l = scan.nextInt();
		    int k = scan.nextInt();
		    if(l%k==0)
		        System.out.println('0');
		    else
		        System.out.println('1');
		    
		    
		}
		

	}
}
