import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_String2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char [] c = scan.next().toCharArray();
		    int pair = 0;
		    for(int i = 0;i<c.length-1;i++){
		        if(c[i]!=c[i+1])
		        {
		            i++;
		            pair++;
		        }
		    }
		    System.out.println(pair);
		}

	}
}
