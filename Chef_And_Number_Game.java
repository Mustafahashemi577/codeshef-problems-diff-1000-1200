import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Number_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = scan.nextInt();
		    }
		    ArrayList <Integer> a1=new ArrayList<>();
		     ArrayList <Integer> a2=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>=0)
		        {
		            a1.add(a[i]);
		        }
		        else
		        {
		            a2.add(a[i]);
		        }
		  }
		  if(a1.size()==0)
		  {
		      System.out.println(a2.size()+" "+a2.size());
		  }
		  else if(a2.size()==0)
		  {
		      System.out.println(a1.size()+" "+a1.size());
		  }
		  else
		  {
		      System.out.println(Math.max(a1.size(),a2.size())+" "+ Math.min(a1.size(),a2.size()));
		  }
		}
	}
}
