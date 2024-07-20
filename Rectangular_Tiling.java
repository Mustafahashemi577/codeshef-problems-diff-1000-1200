import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangular_Tiling
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int w = scan.nextInt();
		    int l = scan.nextInt();
		     if((w*l)%2 == 0){
    		      System.out.println("YES");
    		  }
    		  else{
    		      System.out.println("NO");
    		  }
		}

	}
}
