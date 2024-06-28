import java.util.*;
import java.lang.*;
import java.io.*;

class Fit_In_Data_Type
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    
		    System.out.println(x>n?x%(n+1):x);
		}

	}
}
