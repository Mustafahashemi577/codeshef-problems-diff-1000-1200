import java.util.*;
import java.lang.*;
import java.io.*;

class Slow_Start
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int h = scan.nextInt();
		    int s = 0;
		    int term =0;
		    while(s<h){
		        if(term<5){
		        s+=x/2;
		        term++;
		        }
		        else{
		        s+=x;
		        term++;
		        }
		    }
		    System.out.println(term);
		}

	}
}
