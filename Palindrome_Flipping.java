import java.util.*;
import java.lang.*;
import java.io.*;

class Palindrome_Flipping
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char [] s = scan.next().toCharArray();
		    int zeros =0;
		    int ones = 0;
		    for(int i = 0;i<n;i++){
		        if(s[i]=='0')
		        zeros++;
		        else
		        ones++;
		    }
		    if(n%2==0 && (zeros %2==0 && ones%2==0))
		    System.out.println("YES");
		    else if(n%2!=0 && (zeros%2==1 && ones%2==0)||(zeros%2==0 && ones%2==1))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
