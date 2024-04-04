import java.util.*;
import java.lang.*;
import java.io.*;

class Zero_String 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int ones = 0 ;
		    int zeros = 0;
		    for(int i = 0;i<n;i++){
		        if (s.charAt(i)=='1')
		        ones++;
		        else
		        zeros++;
		    }
		    
		    System.out.println(zeros<ones? (1+zeros) : ones);
		    }

	}
}
