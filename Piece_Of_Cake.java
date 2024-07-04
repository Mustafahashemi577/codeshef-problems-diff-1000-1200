import java.util.*;
import java.lang.*;
import java.io.*;

class Piece_Of_Cake
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	       char c [] = scan.next().toCharArray();
	       int max = 1;
	       int secondMax = 1;
	       Arrays.sort(c);
	       for(int i =1;i<c.length;i++){
	           if(c[i]==c[i-1])
	                secondMax++;
	           else
	                secondMax=1;
	           if(secondMax>max)
	               max=secondMax;
	       }
	       System.out.println(max==(c.length-max)?"YES":"NO");
	    }

	}
}
