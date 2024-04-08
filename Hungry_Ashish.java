import java.util.*;
import java.lang.*;
import java.io.*;

class Hungry_Ashish
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        int z = scan.nextInt();
	        if (x>=y)
	        System.out.println("PIZZA");
	        else if (x>=z)
	        System.out.println("BURGER");
	        else
	        System.out.println("NOTHING");
	    }

	}
}
