import java.util.*;
import java.lang.*;
import java.io.*;

class Ping_Paja_Pong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int k = scan.nextInt();
		    if(((x+y)%(2*k)) < k)
		        System.out.println("Chef");
		    else
		        System.out.println("Paja");
		    }

	}
}
