import java.util.*;
import java.lang.*;
import java.io.*;

class The_One_Where_It_All_Began
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    System.out.println(n>=21?"YES":"NO");
		}

	}
}
