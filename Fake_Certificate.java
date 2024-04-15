import java.util.*;
import java.lang.*;
import java.io.*;

class Fake_Certificate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int max = 0;
		    int ones = 0;
		    int c = 0;
		    for(int i = 0;i<n;i++){
		        if (s.charAt(i)=='0'){
		            c++;
		            if (c>max)
		            max = c;
		        }
		        else
		        {
		            c=0;
		            ones++;
		        }
		    }
		    System.out.println(max+ones);
		}

	}
}
