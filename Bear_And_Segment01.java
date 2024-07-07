import java.util.*;
import java.lang.*;
import java.io.*;

class Bear_And_Segment01
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    boolean answer = false;
		    String given = scan.next();
		    if(given.contains("1"))
		    {
		        int first = given.indexOf('1');
		        int last = given.lastIndexOf('1');
		        String segment = given.substring(first, last+1);
		        if(!segment.contains("0"))
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else
		    System.out.println("NO");
		}

	}
}
