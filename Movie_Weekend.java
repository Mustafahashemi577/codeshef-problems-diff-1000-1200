import java.util.*;
import java.lang.*;
import java.io.*;
class Movie_Weekend
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt(),i,max=0;
		    int l[]=new int[n];
		    int r[]=new int[n];
		    int lr[]=new int[n];
		    for (i=0; i<n; i++) l[i]=scan.nextInt();
		    for (i=0; i<n; i++)
		    {
		        r[i]=scan.nextInt();
		        lr[i]=l[i]*r[i];
		    }
		    for (i=1; i<n; i++)
		        if(lr[i]>lr[max]||(lr[i]==lr[max]&&r[i]>r[max]))
		            max=i;
		    System.out.println(max+1);
		}
	}
}