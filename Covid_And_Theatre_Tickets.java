import java.util.*;
import java.lang.*;
import java.io.*;

class Covid_And_Theatre_Tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    if ((n%2!=0)&&(m%2!=0))
		    System.out.println(((n/2)+1)*((m/2)+1));
		    else if ((n%2==0)&&(m%2==0))
		    System.out.println((n/2)*(m/2));
		    else if ((n%2!=0)&&(m%2==0))
		    System.out.println(((n/2)+1)*(m/2));
		    else if ((n%2==0)&&(m%2!=0))
		    System.out.println((n/2)*((m/2)+1));
		}

	}
}
