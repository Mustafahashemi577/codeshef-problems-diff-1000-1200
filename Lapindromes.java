import java.util.*;
import java.lang.*;
import java.io.*;

class Lapindromes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    int n = s.length();
		    char a[],b[];
		    if(n%2==0){
		         a = s.substring(0,(n/2)).toCharArray();
		         b = s.substring((n/2),n).toCharArray();
		    }
		    else{
		         a = s.substring(0,(n/2)).toCharArray();
		         b = s.substring((n/2)+1,n).toCharArray();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    String d = new String(a);
		    String e = new String (b);
		    System.out.println(e.equals(d)?"YES":"NO");
		    
		}

	}
}

