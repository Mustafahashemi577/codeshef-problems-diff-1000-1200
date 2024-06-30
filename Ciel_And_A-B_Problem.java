import java.util.*;
import java.lang.*;
import java.io.*;

class Ciel_And_A-B_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int result = a-b;
	    int d = result-10*(result/10);
	    System.out.println(d>=0 && d<9?result+1:result-1);

	}
}
