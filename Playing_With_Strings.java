import java.util.*;
import java.lang.*;
import java.io.*;

class Playing_With_Strings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char a[]=scan.next().toCharArray();
		    char b[]= scan.next().toCharArray();
		    int onea = 0;
		    int oneb = 0;
		    int zeroa = 0;
		    int zerob = 0;
		    for(int i =0;i<n;i++){
		        if (a[i]=='1')
		        onea++;
		        else
		        zeroa++;
		        if(b[i]=='1')
		        oneb++;
		        else
		        zerob++;
		    }
		    if(zeroa==zerob && oneb==onea)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
