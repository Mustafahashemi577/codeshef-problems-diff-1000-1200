import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_Card_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int s = 52;
		    int k = scan.nextInt();
		    int remove=0;
		    while(s%k!=0){
		        remove++;
		        s--;
		    }
		    System.out.println(remove);
		}

	}
}
