import java.util.*;
import java.lang.*;
import java.io.*;

class Average_Of_Three
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int d = x*3;
		    int a1 = 1;
		    int a2 = 2;
		    int a3= 0;
		    for(int i = 0;i<=d-3;i++)
		    if(a2+a1+i==d){
		     a3=i;
		    break;
		    }
		    System.out.println(a1+" "+a2+" "+a3);
		}

	}
}
