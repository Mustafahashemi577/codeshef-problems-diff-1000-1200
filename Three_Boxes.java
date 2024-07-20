import java.util.*;
import java.lang.*;
import java.io.*;

class Three_Boxes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    int sum = a+b+c;
		    if(sum<=d)
		    System.out.println(1);
		    else if (a+b<=d)
		    System.out.println(2);
		    else if (a+c <= d)
		    System.out.println(2);
		    else if (b+c<=d)
		    System.out.println(2);
		    else
		    System.out.println(3);
		}

	}
}
