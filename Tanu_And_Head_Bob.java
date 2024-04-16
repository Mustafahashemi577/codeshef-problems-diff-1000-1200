import java.util.*;
import java.lang.*;
import java.io.*;

class Tanu_And_Head_Bob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int i =0;
		    for(;i<n;i++){
		        if (s.charAt(i)=='Y')
		        {
		            System.out.println("NOT INDIAN");
		            break;
		        }
		        if (s.charAt(i)=='I')
		        {
		            System.out.println("INDIAN");
		            break;
		        }
		    }
		    if(i==n)
		    System.out.println("NOT SURE");
		}
	}
}
