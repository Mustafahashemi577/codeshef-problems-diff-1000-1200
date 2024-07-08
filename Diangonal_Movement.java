import java.util.*;
import java.lang.*;
import java.io.*;

class Diangonal_Movement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int difference = Math.abs(x-0)+Math.abs(y-0);
		    
		    System.out.println(difference%2==0?"YES":"NO");
		}

	}
}
